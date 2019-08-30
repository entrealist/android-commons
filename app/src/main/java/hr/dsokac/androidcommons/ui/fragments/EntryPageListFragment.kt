package hr.dsokac.androidcommons.ui.fragments

import androidx.fragment.app.viewModels
import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import androidx.recyclerview.widget.RecyclerView
import hr.dsokac.androidcommons.R
import hr.dsokac.androidcommons.core.fragments.PageListFragment
import hr.dsokac.androidcommons.models.ui.Entry
import hr.dsokac.androidcommons.ui.adapters.EntryPageListAdapter
import hr.dsokac.androidcommons.viewmodel.EntryPagedListViewModel

class EntryPageListFragment : PageListFragment<Entry>() {
    companion object {
        fun newInstance(): EntryListFragment {
            return EntryListFragment()
        }
    }

    private val adapter by lazy {
        EntryPageListAdapter(viewModel.getData() as LiveData<PagedList<Entry>>, viewLifecycleOwner)
    }

    override val viewModel: EntryPagedListViewModel by viewModels()

    override fun getAdapter(): RecyclerView.Adapter<*> = adapter

    override fun getTitleRes(): Int = R.string.title_entry_paged_list_fragment

}