[core](../../index.md) / [com.github.kacso.androidcommons.core.activities](../index.md) / [BaseActivity](index.md) / [getAlternativeThemeRes](./get-alternative-theme-res.md)

# getAlternativeThemeRes

`@StyleRes open fun getAlternativeThemeRes(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`

This method is called in order to assign user defined themes to activity.
By default, this method will return theme defined in [BaseApplication.getAppTheme](../../com.github.kacso.androidcommons.core/-base-application/get-app-theme.md).

**Return**
[StyleRes](#) representing theme to be used in activity, or null if default theme should be used

