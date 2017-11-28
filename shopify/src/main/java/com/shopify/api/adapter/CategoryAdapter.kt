package com.shopify.api.adapter

import com.domain.entity.Category
import com.shopify.buy3.Storefront

object CategoryAdapter {

    fun adapt(shop: Storefront.Shop, collection: Storefront.Collection): Category {
        return Category(
                collection.id.toString(),
                collection.title,
                collection.description,
                collection.descriptionHtml ?: "",
                ImageAdapter.adapt(collection.image),
                collection.updatedAt.toDate(),
                ProductListAdapter.adapt(shop, collection.products)
        )
    }
}
