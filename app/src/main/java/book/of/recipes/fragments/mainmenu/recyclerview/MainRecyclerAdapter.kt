package book.of.recipes.fragments.mainmenu.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import book.of.recipes.R
import book.of.recipes.data.RecipesListModel
import kotlinx.android.synthetic.main.main_recycler_view_item.view.*

class MainRecyclerAdapter(private val recyclerList: ArrayList<RecipesListModel>) :
    RecyclerView.Adapter<MainRecyclerAdapter.RecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        return RecyclerViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.main_recycler_view_item, parent, false)
        )
    }

    override fun getItemCount() = recyclerList.size

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        
        holder.bind(recyclerList[position])
    }

    class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(model: RecipesListModel) {
            itemView.image_of_a_dish.setImageDrawable(model.iconsRecipe?.let {
                ContextCompat.getDrawable(
                    itemView.context,
                    it
                )
            })
            itemView.dish_description.text = model.description
        }
    }
}