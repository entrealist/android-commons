[security](../../index.md) / [com.github.kacso.androidcommons.security.repositories.impl](../index.md) / [OAuth2Repository](.)

# OAuth2Repository

`open class OAuth2Repository : `[`IOAuth2Repository`](../../com.github.kacso.androidcommons.security.repositories/-i-o-auth2-repository/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `OAuth2Repository(sharedPrefs: <ERROR CLASS>, service: `[`OAuth2Service`](../../com.github.kacso.androidcommons.security.network.services/-o-auth2-service/index.md)`, authorizationKey: String)` |

### Functions

| Name | Summary |
|---|---|
| [clearSession](clear-session.md) | `open fun clearSession(): Unit`<br>Clears all session data (such as access token, username, etc.) when user has been logged out |
| [getAccessToken](get-access-token.md) | `open fun getAccessToken(): String?`<br>Retrieve active access token assigned for active session |
| [getRefreshToken](get-refresh-token.md) | `open fun getRefreshToken(): String?`<br>Retrieve active refresh token assign for active session |
| [getTokenType](get-token-type.md) | `open fun getTokenType(): String?`<br>Retrieve token type (e.g. Bearer) used for user authorization |
| [getUsername](get-username.md) | `open fun getUsername(): String?`<br>Retrieve username of authorized user |
| [login](login.md) | `fun login(username: String, password: String): Unit` |
| [logout](logout.md) | `fun logout(): Unit` |
| [refreshToken](refresh-token.md) | `fun refreshToken(): Unit` |
| [save](save.md) | `open fun save(accessToken: String, refreshToken: String, tokenType: String): Unit`<br>Save tokens assign to newly created session |
| [saveUsername](save-username.md) | `open fun saveUsername(username: String): Unit`<br>Saves username of authorized user |

### Inherited Functions

| Name | Summary |
|---|---|
| [getAuthorizationHeader](../../com.github.kacso.androidcommons.security.repositories/-i-o-auth2-repository/get-authorization-header.md) | `open fun getAuthorizationHeader(): String`<br>Generates authorization header value by combining token type and token value |

### Companion Object Properties

| Name | Summary |
|---|---|
| [LOG_TAG](-l-o-g_-t-a-g.md) | `const val LOG_TAG: String` |