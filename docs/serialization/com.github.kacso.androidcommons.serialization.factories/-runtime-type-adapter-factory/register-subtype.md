[serialization](../../index.md) / [com.github.kacso.androidcommons.serialization.factories](../index.md) / [RuntimeTypeAdapterFactory](index.md) / [registerSubtype](./register-subtype.md)

# registerSubtype

`fun registerSubtype(type: `[`Class`](http://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)`<out `[`T`](index.md#T)`>, label: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`RuntimeTypeAdapterFactory`](index.md)`<`[`T`](index.md#T)`>`

Registers `type` identified by `label`. Labels are case sensitive.

### Exceptions

`IllegalArgumentException` - if either `type` or `label` have already been registered on this type adapter.`fun registerSubtype(type: `[`Class`](http://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)`<out `[`T`](index.md#T)`>): `[`RuntimeTypeAdapterFactory`](index.md)`<`[`T`](index.md#T)`>`

Registers `type` identified by its ``[`simple`](#). Labels are case sensitive.

### Exceptions

`IllegalArgumentException` - if either `type` or its simple name have already been registered on this type adapter.