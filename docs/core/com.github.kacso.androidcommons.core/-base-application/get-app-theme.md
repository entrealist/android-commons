[core](../../index.md) / [com.github.kacso.androidcommons.core](../index.md) / [BaseApplication](index.md) / [getAppTheme](./get-app-theme.md)

# getAppTheme

`@StyleRes open fun getAppTheme(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`

This method returns theme which will be used across all activities.
In case that theme defined in AndroidManifest would like to be used, returned value
must be null (which is default value)

**Return**
[StyleRes](#) representing theme to be used or null if default should be used

