package hr.dsokac.androidcommons.security.factories

import android.content.Context
import hr.dsokac.androidcommons.network.interceptors.NetworkExceptionInterceptor
import hr.dsokac.androidcommons.preferences.factories.SharedPrefsFactory
import hr.dsokac.androidcommons.security.CONNECT_TIMEOUT_SECS
import hr.dsokac.androidcommons.security.READ_TIMEOUT_SECS
import hr.dsokac.androidcommons.security.SECURITY_PREFS
import hr.dsokac.androidcommons.security.network.managers.OAuth2NetworkManager
import hr.dsokac.androidcommons.security.repositories.IOAuth2Repository
import hr.dsokac.androidcommons.security.repositories.IRxOAuth2Repository
import hr.dsokac.androidcommons.security.repositories.impl.OAuth2Repository
import hr.dsokac.androidcommons.security.repositories.impl.RxOAuth2Repository

/**
 * Factory class which generates repositories available in security module
 *
 * @author Danijel Sokač
 */
object SecurityRepositoryFactory {
    private var oAuth2Repository: IOAuth2Repository? = null
    private var rxOAuth2Repository: IRxOAuth2Repository? = null

    /**
     * Obtain instance of [IOAuth2Repository]. This method will ensure that there is
     * always only one instance of [IOAuth2Repository] created.
     *
     * @param baseUrl basic part of authorization server URL. For example: https://192.168.112:8080/security/
     * @param authorizationKey key which will identify app requests on authorization server
     *                         For example: Basic Aycx21312easdxyxyxcyxdcasdfw3
     * @param connectionTimeoutSecs maximum waiting time for connection to establish
     * @param readTimeoutSecs maximum waiting time for server to return response
     * @param networkExceptionInterceptor instance of [NetworkExceptionInterceptor] which will convert errors, or null
     *                          if such interceptor is not needed
     *
     * @return instance of [IOAuth2Repository]
     */
    @Synchronized
    fun getOAuth2Repository(
        context: Context,
        baseUrl: String,
        authorizationKey: String,
        connectionTimeoutSecs: Long = CONNECT_TIMEOUT_SECS,
        readTimeoutSecs: Long = READ_TIMEOUT_SECS,
        networkExceptionInterceptor: NetworkExceptionInterceptor? = null
    ): IOAuth2Repository {
        if (oAuth2Repository == null) {
            oAuth2Repository = OAuth2Repository(
                authorizationKey = authorizationKey,
                sharedPrefs = SharedPrefsFactory.getSharedPrefs(context, SECURITY_PREFS),
                service = OAuth2NetworkManager(
                    baseUrl,
                    connectionTimeoutSecs,
                    readTimeoutSecs,
                    networkExceptionInterceptor
                ).restService
            )
        }
        return oAuth2Repository!!
    }

    /**
     * Obtain instance of [IRxOAuth2Repository]. This method will ensure that there is
     * always only one instance of [IRxOAuth2Repository] created.
     *
     * @param baseUrl basic part of authorization server URL. For example: https://192.168.112:8080/security/
     * @param authorizationKey key which will identify app requests on authorization server
     *                         For example: Basic Aycx21312easdxyxyxcyxdcasdfw3
     * @param connectionTimeoutSecs maximum waiting time for connection to establish
     * @param readTimeoutSecs maximum waiting time for server to return response
     * @param networkExceptionInterceptor instance of [NetworkExceptionInterceptor] which will convert errors, or null
     *                          if such interceptor is not needed
     *
     * @return instance of [IRxOAuth2Repository]
     */
    @Synchronized
    fun getRxOAuth2Repository(
        context: Context,
        baseUrl: String,
        authorizationKey: String,
        connectionTimeoutSecs: Long = CONNECT_TIMEOUT_SECS,
        readTimeoutSecs: Long = READ_TIMEOUT_SECS,
        networkExceptionInterceptor: NetworkExceptionInterceptor? = null
    ): IRxOAuth2Repository {
        if (rxOAuth2Repository == null) {
            rxOAuth2Repository = RxOAuth2Repository(
                authorizationKey = authorizationKey,
                sharedPrefs = SharedPrefsFactory.getSharedPrefs(context, SECURITY_PREFS),
                service = OAuth2NetworkManager(
                    baseUrl,
                    connectionTimeoutSecs,
                    readTimeoutSecs,
                    networkExceptionInterceptor
                ).rxService
            )
        }
        return rxOAuth2Repository!!
    }
}