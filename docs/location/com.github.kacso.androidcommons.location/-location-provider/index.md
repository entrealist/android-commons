[location](../../index.md) / [com.github.kacso.androidcommons.location](../index.md) / [LocationProvider](./index.md)

# LocationProvider

`class LocationProvider`

Use this class to retrieve real-time location updates.
Location updates are emitted through [LiveData](#) inside [Resource](#) model.
This class makes sure that location updates are generated only when there are active observers.

### Parameters

`context` - App active context

`locationRequest` - A data object that contains quality of service parameters for location updates.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `LocationProvider(context: Context, locationRequest: LocationRequest = LocationRequest.create())`<br>Use this class to retrieve real-time location updates. Location updates are emitted through [LiveData](#) inside [Resource](#) model. This class makes sure that location updates are generated only when there are active observers. |

### Functions

| Name | Summary |
|---|---|
| [getLocation](get-location.md) | `fun getLocation(): LiveData<Resource<Location>>`<br>Retrieve [LiveData](#) object on which [Location](#) or [ErrorHolder](#) will be emitted |
