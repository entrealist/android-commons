[core](../../index.md) / [com.github.kacso.androidcommons.core.fragments](../index.md) / [FilterableListFragment](index.md) / [getEmptyListView](./get-empty-list-view.md)

# getEmptyListView

`open fun getEmptyListView(): View?`

Overrides [ListFragment.getEmptyListView](../-list-fragment/get-empty-list-view.md)

Return view that will be displayed to user when there is no data in [RecyclerView](#).
By default it will return [TextView](#) with default message. To change message displayed
call [setEmptyListViewText](../-list-fragment/set-empty-list-view-text.md).

Override this method if you would like to display more complex view to the user.

**Return**
[View](#) that will be displayed if there is no data in [RecyclerView](#), if null
    nothing will be displayed in such situation

