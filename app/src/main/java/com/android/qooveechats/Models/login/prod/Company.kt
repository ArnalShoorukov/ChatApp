package com.qoovee.app.android.models.login.prod

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

import java.io.Serializable

class Company : Serializable {

    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("email")
    @Expose
    var email: String? = null
    @SerializedName("phone")
    @Expose
    var phone: String? = null
    @SerializedName("slug")
    @Expose
    var slug: String? = null
    @SerializedName("verified")
    @Expose
    var verified: Boolean? = null
    @SerializedName("info")
    @Expose
    var info: String? = null
    @SerializedName("business_type")
    @Expose
    var businessType: List<Any>? = null
    @SerializedName("year_established")
    @Expose
    var yearEstablished: Any? = null
    @SerializedName("total_employees")
    @Expose
    var totalEmployees: Any? = null
    @SerializedName("website")
    @Expose
    var website: String? = null
    @SerializedName("city")
    @Expose
    var city: String? = null
    @SerializedName("street_address")
    @Expose
    var streetAddress: String? = null
    @SerializedName("zip")
    @Expose
    var zip: Any? = null
    /* public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
*/
    @SerializedName("industries")
    @Expose
    var industries: List<String>? = null
    @SerializedName("status")
    @Expose
    var status: String? = null
    @SerializedName("rejected_reason")
    @Expose
    var rejectedReason: Any? = null
    @SerializedName("logo")
    @Expose
    var logo: Any? = null
    @SerializedName("background")
    @Expose
    var background: Any? = null
    @SerializedName("api_url")
    @Expose
    var apiUrl: String? = null
    @SerializedName("detail_url")
    @Expose
    var detailUrl: String? = null
    @SerializedName("contacts")
    @Expose
    var contacts: List<Contact>? = null
    @SerializedName("country")
    @Expose
    var country: Country? = null
    @SerializedName("membership")
    @Expose
    var membership: Int? = null
    @SerializedName("membership_exp_date")
    @Expose
    var membershipExpDate: Any? = null

    companion object {
        private const val serialVersionUID = 5614890286747212500L
    }

}