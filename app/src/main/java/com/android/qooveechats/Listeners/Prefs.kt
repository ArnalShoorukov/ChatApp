package com.android.qooveechats.Listeners

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences

/**
 * Created by arnal on 2/20/18.
 */
class Prefs(context: Context) {

    val PREFS_FILENAME = "com.qoovee.app.android.settings"
    val PREF_CC = "pref_country_code"
    val PREF_USER_COUNTRY = "pref_user_country"
    val PREF_LANGUAGE = "pref_language"
    val PREF_TOKEN = "pref_token"
    val PREF_PASSWORD = "pref_password"
    val PREF_LIMIT = "pref_limit"
    val PREF_NAME = "pref_name"
    val PREF_PHONE = "pref_phone"
    val PREF_EMAIL = "pref_email"
    val COOKIES = "cookies"
    val COOKIE = "cookie"
    val CONTENT_LANGUAGE = "content_language"
    val PREF_FIRST_TIME = "pref_first_time"
    val PREF_COMPANY = "pref_company"
    val PREF_CHECK_COMPANY = "pref_check_company"
    val PREF_HAVE_COMPANY = "pref_have_company"
    val PREF_REQUEST_NOTIFY = "pref_request_notify"
    val PREF_SIGNED_IN = "pref_signed_in"
    val PREF_RESULT_TAGS = "pref_result_tags"
    val PREF_SLUG = "pref_slug"
    val PREF_URL = "pref_url"
    val PREF_URL_COUNTRY = "pref_url_country"
    val PREF_BLOCK_COUNTRY = "pref_block_country"
    val PREF_URL_SUPPLIERS = "pref_url_suppliers"
    val PREF_URL_SUPPLIERS_COUNTRY = "pref_url_suppliers_country"
    val PREF_URL_TENDERS = "pref_url_tenders"
    val PREF_URL_TENDERS_COUNTRY = "pref_url_tenders_country"
    val PREF_REFRESH = "refresh"
    val PREF_NOTIFICATIONS_IDS = "pref_notifications_ids"
    val PREF_COMPANY_IDS = "pref_company_ids"
    val PREF_COMPANY_BALANCE = "pref_company_balance"
    val PREF_RATE_TEST = "pref_test_rate"
    val SUGGEST_RATE = "suggest_rate"
    val PREF_COMPANY_USER_ID = "pref_company_user_id"


    val prefs: SharedPreferences = context.getSharedPreferences(PREFS_FILENAME, MODE_PRIVATE)

    var token: String?
        get() = prefs.getString(PREF_TOKEN, "QV eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ0aW1lIjoiMjAxNy0xMS0wM1QwNToxOTowNS4zNDcxNTcrMDA6MDAiLCJob3N0X2F1dGgiOm51bGx9.aR0T35xz8SvCvC6eaPA9csA7hmhUB-qQKPrKRKWxQ3Q")
        set(value) = prefs.edit().putString(PREF_TOKEN, value).apply()

    var password: String?
        get() = prefs.getString(PREF_PASSWORD, null)
        set(value) = prefs.edit().putString(PREF_PASSWORD, value).apply()

    var balance: String?
        get() = prefs.getString(PREF_COMPANY_BALANCE, "0")
        set(value) = prefs.edit().putString(PREF_COMPANY_BALANCE, value!!).apply()

    var suggest_rate: Int?
        get() = prefs.getInt(SUGGEST_RATE, 0)
        set(value) = prefs.edit().putInt(SUGGEST_RATE, value!!).apply()

     var rateTest: String?
        get() = prefs.getString(PREF_RATE_TEST, "0")
        set(value) = prefs.edit().putString(PREF_RATE_TEST , value!!).apply()

    var userId: Int?
        get() = prefs.getInt(PREF_COMPANY_USER_ID, 0)
        set(value) = prefs.edit().putInt(PREF_COMPANY_USER_ID, value!!).apply()

    var refresh: String?
        get() = prefs.getString(PREF_REFRESH, null)
        set(value) = prefs.edit().putString(PREF_REFRESH, value).apply()

    var notificationsIds: String?
            get() = prefs.getString(PREF_NOTIFICATIONS_IDS, null)
            set(value) = prefs.edit().putString(PREF_NOTIFICATIONS_IDS, value).apply()

    var companyIds: String?
            get() = prefs.getString(PREF_COMPANY_IDS, null)
            set(value) = prefs.edit().putString(PREF_COMPANY_IDS, value).apply()

    var limit: String?
        get() = prefs.getString(PREF_LIMIT, null)
        set(value) = prefs.edit().putString(PREF_LIMIT, value).apply()

    var cc: String?
        get() = prefs.getString(PREF_CC, null)
        set(value) = prefs.edit().putString(PREF_CC, value).apply()

    var userCountry: String?
        get() = prefs.getString(PREF_USER_COUNTRY, null)
        set(value) = prefs.edit().putString(PREF_USER_COUNTRY, value).apply()

    var language: String?
        get() = prefs.getString(PREF_LANGUAGE, null)
        set(value) = prefs.edit().putString(PREF_LANGUAGE, value).apply()

    var name: String?
        get() = prefs.getString(PREF_NAME, null)
        set(value) = prefs.edit().putString(PREF_NAME, value).apply()

    var phone: String?
        get() = prefs.getString(PREF_PHONE, null)
        set(value) = prefs.edit().putString(PREF_PHONE, value).apply()

    var email: String?
        get() = prefs.getString(PREF_EMAIL, null)
        set(value) = prefs.edit().putString(PREF_EMAIL, value).apply()

    var url: String?
        get() = prefs.getString(PREF_URL, null)
        set(value) = prefs.edit().putString(PREF_URL, value).apply()
    var urlCountry: String?
        get() = prefs.getString(PREF_URL_COUNTRY, null)
        set(value) = prefs.edit().putString(PREF_URL_COUNTRY, value).apply()
    var blockCountry: String?
        get() = prefs.getString(PREF_BLOCK_COUNTRY, null)
        set(value) = prefs.edit().putString(PREF_BLOCK_COUNTRY, value).apply()
    var urlSuppliers: String?
        get() = prefs.getString(PREF_URL_SUPPLIERS, null)
        set(value) = prefs.edit().putString(PREF_URL_SUPPLIERS, value).apply()

    var urlSuppliersCountry: String?
        get() = prefs.getString(PREF_URL_SUPPLIERS_COUNTRY, null)
        set(value) = prefs.edit().putString(PREF_URL_SUPPLIERS_COUNTRY, value).apply()

    var urlTenders: String?
        get() = prefs.getString(PREF_URL_TENDERS, null)
        set(value) = prefs.edit().putString(PREF_URL_TENDERS, value).apply()

    var urlTendersCountry: String?
        get() = prefs.getString(PREF_URL_TENDERS_COUNTRY, null)
        set(value) = prefs.edit().putString(PREF_URL_TENDERS_COUNTRY, value).apply()


    var firstTime: Boolean
        get() = prefs.getBoolean(PREF_FIRST_TIME, true)
        set(value) = prefs.edit().putBoolean(PREF_FIRST_TIME, value).apply()

    var company: Boolean
        get() = prefs.getBoolean(PREF_COMPANY, false)
        set(value) = prefs.edit().putBoolean(PREF_COMPANY, value).apply()

    var companyCheck: Boolean
        get() = prefs.getBoolean(PREF_CHECK_COMPANY, false)
        set(value) = prefs.edit().putBoolean(PREF_CHECK_COMPANY, value).apply()

    var companyExist: Boolean
        get() = prefs.getBoolean(PREF_HAVE_COMPANY, false)
        set(value) = prefs.edit().putBoolean(PREF_HAVE_COMPANY, value).apply()


    var request_notify: Boolean
        get() = prefs.getBoolean(PREF_REQUEST_NOTIFY, true)
        set(value) = prefs.edit().putBoolean(PREF_REQUEST_NOTIFY, value).apply()


    var signedIn: Boolean
        get() = prefs.getBoolean(PREF_SIGNED_IN, false)
        set(value) = prefs.edit().putBoolean(PREF_SIGNED_IN, value).apply()

    var cookies: HashSet<String>?
        get() = prefs.getStringSet(COOKIES, null) as HashSet<String>?
        set(value) = prefs.edit().putStringSet(COOKIES, value).apply()

    var cookie: String?
        get() = prefs.getString(COOKIE, null)
        set(value) = prefs.edit().putString(COOKIE, value).apply()

    var contentLanguage: String?
        get() = prefs.getString(CONTENT_LANGUAGE, "ru")
        set(value) = prefs.edit().putString(CONTENT_LANGUAGE, value).apply()

    var slug: String?
        get() = prefs.getString(PREF_SLUG, null)
        set(value) = prefs.edit().putString(PREF_SLUG, value).apply()
}