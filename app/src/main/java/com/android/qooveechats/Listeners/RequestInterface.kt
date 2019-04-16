package com.android.qooveechats.Listeners

import com.android.qooveechats.Models.ResetConfirmRaw
import com.android.qooveechats.Models.login.Login
import io.reactivex.Observable
import retrofit2.Response
import retrofit2.http.*

interface RequestInterface {

    /*@GET("industries/")
    fun getIndustires(@Header("Content-Type") type: String) : Observable<Sample>

    @GET("category_children/{id}/")
    fun getChildCategory(@Header("Content-Type") type: String,
                         @Path("id") id: Int) : Observable<Sample>*/
    @Headers("Content-Type: application/json")
    @POST("accounts/login/")
    fun login(@Header("Authorization") token: String,
             /// @Header("Content-Type") type: String,
              @Body data: ResetConfirmRaw): Observable<Response<Login>>


    @GET("accounts/me/")
    fun loginMe(@Header("Authorization") token: String,
                @Header("Accept-Language") language : String) : Observable<Login>

    @GET("accounts/me/")
    fun language(@Header("Authorization") token: String,
                @Header("Accept-Language") language : String) : Observable<Response<Login>>

   /* @POST("accounts/username/check/")
    fun checkUsername(@Header("Authorization") token: String, @Field("username") emailOrNumber: String): Observable<ResponseUsername>
*/
   /* @POST("accounts/signup/")
    @FormUrlEncoded
    fun signUp(@Header("Authorization") token: String,
               @Header("Accept-Language") language : String,
               @Field("username") emailOrNumber: String,
               @Field("name") name:String,
               @Field("password") password: String): Observable<Signup>

    @POST("accounts/code/confirm/")
    @FormUrlEncoded
    fun confirm(@Header("Authorization") token: String,
                @Field("username") username: String,
                @Field("code") code:String): Observable<Response<Confirmation>>

    @POST("accounts/code/resend/")
    @FormUrlEncoded
    fun resend(@Header("Authorization") token: String,
               @Field("username") username: String): Observable<Resend>
*/

    /*@POST("accounts/change_language/")
    fun changeLanguage(@Header("Authorization") token: String,
                       @Header("Content-Type") type: String,
                       @Header("Accept-Language") language1: String,
                       @Body language: Language): Observable<Language>
*/

  /*  @POST("accounts/change_language/")
    @FormUrlEncoded
    fun changeLanguage(@Header("Authorization") token: String,
                       @Header("Accept-Language") language1: String,
                       @Field ("language")language: String): Observable<Language>

    @POST("target/settings/")
    @FormUrlEncoded
    fun increaseRate(@Header("Authorization") token: String,
                     @Header("Accept-Language") language1: String,
                     @Field ("rate")rate: String,
                     @Field ("company_id")company_id: Int ): Observable<ReadNotifications>

    @POST("target/track/")
    @FormUrlEncoded
    fun targetTrack(@Header("Authorization") token: String,
                     @Header("Accept-Language") language1: String,
                     @Field ("action")action: String,
                     @Field ("company_id")company_id: Int,
                     @Field ("object_id")object_id: Int ): Observable<ReadNotifications>

    @POST("target/up/")
    @FormUrlEncoded
    fun targetUp(@Header("Authorization") token: String,
                 @Header("Accept-Language") language1: String,
                 @Header("X-Requested-With") xmlhhtpRequest: String,
                 @Header("Content-Type") type: String,
                 @Field ("company_id")company_id: Int,
                 @Field ("good_id")good_id: Int): Observable<ReadNotifications>

    @POST("target/down/")
    @FormUrlEncoded
    fun targetDown(@Header("Authorization") token: String,
                 @Header("Accept-Language") language1: String,
                 @Header("X-Requested-With") xmlhhtpRequest: String,
                 @Header("Content-Type") type: String,
                 @Field ("company_id")company_id: Int,
                 @Field ("good_id")good_id: Int): Observable<ReadNotifications>

    @POST("target/up/")
    @FormUrlEncoded
    fun targetUpService(@Header("Authorization") token: String,
                 @Header("Accept-Language") language1: String,
                 @Header("X-Requested-With") xmlhhtpRequest: String,
                 @Header("Content-Type") type: String,
                 @Field ("company_id")company_id: Int,
                 @Field ("service_id")good_id: Int): Observable<ReadNotifications>

    @POST("target/down/")
    @FormUrlEncoded
    fun targetDownService(@Header("Authorization") token: String,
                 @Header("Accept-Language") language1: String,
                 @Header("X-Requested-With") xmlhhtpRequest: String,
                 @Header("Content-Type") type: String,
                 @Field ("company_id")company_id: Int,
                 @Field ("service_id")good_id: Int): Observable<ReadNotifications>

     @GET("target/report/{slug}/")
     fun targetReport(@Header("Authorization") token: String,
                      @Header("Accept-Language") language1: String,
                      @Path(value = "slug", encoded = true) slug: String): Observable<Response<Target>>


    @POST("accounts/password/change/")
    fun changePassword(@Header("Authorization") token: String,
                       @Header("Content-Type") type: String,
                       @Header("Accept-Language") language1: String,
                       @Body password: Password): Observable<ChangePassword>

    @POST("accounts/password/reset/")
    fun reset(@Header("Authorization") token: String,
              @Header("Content-Type") type: String,
              @Header("Accept-Language") language: String,
              @Body reset: ResetRaw):Observable<Response<Reset>>

    @POST("accounts/password/reset/confirm/")
    fun resetConfirm(@Header("Authorization") token: String,
                     @Header("Content-Type") type: String,
                     @Header("Accept-Language") language: String,
                     @Body reset: ResetConfirmRaw):Observable<Response<LoginP>>



    @GET
    fun getTenders(@Header("Authorization") token: String,
                   @Header("Content-Type") type: String,
                   @Header("Accept-Language") language: String,
                   @Url url: String) : Observable<Tenders>

    @GET("tenders/{id}/")
    fun getTendersId(@Header("Authorization") token: String,
                     @Header("Accept-Language") language: String,
                     @Header("Content-Type") type: String,
                     @Path("id") id: Int) : Observable<Response<ResultTenders>>


   *//* @GET("tags/")
    fun getTags(@Header("Authorization") token: String,
                @Query("limit") limit:String) : Observable<Tags>

    @GET("items/")
    fun getItems(@Header("Authorization") token: String,
                 @Query("limit") limit:Int,
                 @Query("offset") offset:Int) : Observable<Items>*//*

    @GET
    fun getItemsUrl(@Header("Authorization") token: String,
                    @Header("Content-Type") type: String,
                    @Header("Accept-Language") language: String,
                    @Url url: String) : Observable<Response<Items>>
    @GET
    fun getItemsAdminUrl(@Header("Authorization") token: String,
                         @Header("Accept-Language")  language: String,
                         @Url url: String) : Observable<Items>

    @GET("items/")
    fun getItemsCompany(@Header("Authorization") token: String,
                        @Header("Content-Type") type: String,
                        @Header("Accept-Language") language: String,
                        @Query("company")id: Int) : Observable<Items>
    @GET("service/")
    fun getServiceCompany(@Header("Authorization") token: String,
                        @Header("Content-Type") type: String,
                        @Header("Accept-Language") language: String,
                        @Query("company")id: Int) : Observable<Items>

    @GET("companies/{slug}/contacts/")
    fun getContacts(@Header("Authorization") token: String,
                    @Header("Accept-Language")  language: String,
                    @Header("Content-Type") type: String,
                    @Path(value = "slug", encoded = true) slug : String) : Observable<Contacts>

    @POST("companies/{slug}/contacts/")
    @FormUrlEncoded
    fun setContacts(@Header("Authorization") token: String,
                    @Path(value = "slug", encoded = true) slug : String,
                    @Field("contact") contact: Int,
                    @Field("value") value: String,
                    @Field("whatsapp") whatsapp: Boolean,
                    @Field("viber") viber: Boolean,
                    @Field("telegram") telegram: Boolean): Observable<Contacts>

    @GET
    fun getCompanies(@Header("Authorization") token: String,
                     @Header("Content-Type") type: String,
                     @Header("Accept-Language") language: String,
                     @Url url :String) : Observable<Companies>

    @GET
    fun getCompaniesServices(@Header("Authorization") token: String,
                     @Header("Content-Type") type: String,
                     @Header("Accept-Language") language: String,
                     @Url url :String) : Observable<Companies>

    @POST("companies/")
    fun createCompany(@Header("Authorization") token: String,
                      @Header("Content-Type") type: String,
                      @Header("Accept-Language") language : String,
                      @Body body: CompanyCreate): Observable<Response<ResultCompanies>>

    @POST("companies/validate/")
    fun validateCompany(@Header("Authorization") token: String,
                        @Header("Content-Type") type: String,
                        @Header("Accept-Language") language : String,
                        @Body body: CompanyCreate): Observable<Response<Validate>>

    @PUT("companies/{slug}/")
    fun updateCompany(@Header("Authorization") token: String,
                      @Header("Accept-Language")  language: String,
                      @Header("Content-Type") type: String,
                      @Path(value = "slug", encoded = true) slug: String,
                      @Body body: UpdateCompany): Observable<Response<ResultCompanies>>

    @PUT("items/{slug}/")
    fun updateItems(@Header("Authorization") token: String,
                    @Header("Accept-Language")  language: String,
                    @Header("Content-Type") type: String,
                    @Path(value = "slug", encoded = true) slug: String,
                    @Body body: ItemsCreateRaw): Observable<ItemsCreate>

    @PUT("items/{slug}/")
    fun updateItemsPrice(@Header("Authorization") token: String,
                    @Header("Accept-Language")  language: String,
                    @Header("Content-Type") type: String,
                    @Path(value = "slug", encoded = true) slug: String,
                    @Body body: ItemsCreatePrice): Observable<ItemsCreate>

    @PUT("service/{slug}/")
    fun updateService(@Header("Authorization") token: String,
                      @Header("Accept-Language")  language: String,
                      @Header("Content-Type") type: String,
                      @Path(value = "slug", encoded = true) slug: String,
                      @Body body: ItemsCreateRaw): Observable<ItemsCreate>
    @PUT("service/{slug}/")
    fun updateServicePrice(@Header("Authorization") token: String,
                      @Header("Accept-Language")  language: String,
                      @Header("Content-Type") type: String,
                      @Path(value = "slug", encoded = true) slug: String,
                      @Body body: ItemsCreatePrice): Observable<ItemsCreate>

    @GET("companies/{slug}/")
    fun getCompany(@Header("Authorization") token: String,
                   @Header("Accept-Language")  language: String,
                   @Header("Content-Type") type: String,
                   @Path(value = "slug", encoded = true) slug: String): Observable<ResultCompanies>


    @POST("tenders/")
    fun createTender(@Header("Authorization") token: String,
                     @Header("Accept-Language")  language: String,
                     @Header("Content-Type") type: String,
                     @Body body: TendersCreate): Observable<Response<ResultCreateTender>>

    @POST("companies/{slug}/offers/")
    fun offersItem(@Header("Authorization") token: String,
                   @Header("Accept-Language")  language: String,
                   @Path(value = "slug", encoded = true) slug: String,
                   @Body body: DataOffersItem ): Observable<Response<OffersItem>>

    @POST("companies/{slug}/service/offers/")
    fun offersService(@Header("Authorization") token: String,
                      @Header("Accept-Language")  language: String,
                      @Path(value = "slug", encoded = true) slug: String,
                      @Body body: DataOffersItem ): Observable<Response<OffersItem>>

    @GET("companies/{slug}/tenders/")
    fun getTendersAdmin(@Header("Authorization") token: String,
                        @Header("Content-Type") type: String,
                        @Header("Accept-Language")  language: String,
                        @Path(value = "slug", encoded = true) slug: String): Observable<List<ResultTenders>>

    @POST("companies/{slug}/countries/block/")
    fun blockCountry(@Header("Authorization") token: String,
                     @Path(value = "slug", encoded = true) slug: String,
                     @Header("Content-Type") type: String,
                     @Header("Accept-Language")  language: String,
                     @Body countries: BlockedCountries ): Observable<BlockCountry>

    @GET("companies/{slug}/blocked_countries/")
    fun getblockCountry(@Header("Authorization") token: String,
                        @Header("Accept-Language")  language: String,
                        @Path(value = "slug", encoded = true) slug: String,
                        @Header("Content-Type") type: String): Observable<BlockedCountries>

    @POST("files/")
    @Multipart
    fun uploadImage(@Header("Authorization") token: String,
                    @Header("Accept-Language")  language: String,
                    @Part  file: MultipartBody.Part,
                    @Part("file") name:  RequestBody): Observable<FileUpld>

    @POST("companies/{slug}/logo/")
    @Multipart
    fun uploadLogo(@Header("Authorization") token: String,
                   @Header("X-Requested-With") xmlhhtpRequest: String,
                   @Header("Accept-Language")  language: String,
                   @Path(value = "slug", encoded = true) slug: String,
                   @Part  file: MultipartBody.Part,
                   @Part("image") name:  RequestBody): Observable<LogoUpld>

    @DELETE("files/{id}")
    fun deleteImage(@Header("Authorization") token: String,
                    @Header("Content-Type") type: String,
                    @Header("Accept-Language")  language: String,
                    @Path(value = "id", encoded = true) id:  Int): Observable<FileUpld>

    @DELETE("companies/{slug}/logo/")
    @Multipart
    fun deleteLogo(@Header("Authorization") token: String,
                   @Part  file: MultipartBody.Part,
                   @Part("image") name:  RequestBody): Observable<LogoUpld>

    @POST("companies/{slug}/analysis/")
    fun analyse(@Header("Authorization") token: String,
                @Header("Accept-Language")  language: String,
                @Header("Content-Type") type: String,
                @Path(value = "slug", encoded = true) slug: String,
                @Body body: AnalyseBody): Observable<Analyse>

    @POST("tenders/{id}/offers/")
    fun offersTender(@Header("Authorization") token: String,
                     @Header("Content-Type") type: String,
                     @Header("Accept-Language")  language: String,
                     @Path(value = "id", encoded = true) id: Int,
                     @Body body: TendersOffers): Observable<Response<OffersTender>>

    @GET("tenders/{id}/offers/")
    fun getTenderOffers(@Header("Authorization") token: String,
                        @Header("Content-Type") type: String,
                        @Header("Accept-Language")  language: String,
                        @Path(value = "id", encoded = true) id: Int): Observable<Response<TenderOffers>>

    @POST("companies/{slug}/contacting/")
    fun contacting(@Header("Authorization") token: String,
                   @Header("Accept-Language")  language: String,
                   @Header("Content-Type") type: String,
                   @Path(value = "slug", encoded = true) slug: String,
                   @Body body: DataOffersItem): Observable<Response<OffersItem>>

    @GET("companies/{slug}/contacting/")
    fun contactingGet(@Header("Authorization") token: String,
                   @Header("Accept-Language")  language: String,
                   @Header("Content-Type") type: String,
                   @Path(value = "slug", encoded = true) slug: String): Observable<Inquires>

    @GET("companies/{slug}/offers/")
    fun getItemsOffer(@Header("Authorization") token: String,
                      @Header("Accept-Language")  language: String,
                      @Header("Content-Type") type: String,
                      @Path(value = "slug", encoded = true) slug: String): Observable<InquireItems>

    @GET("companies/{slug}/service/offers/")
    fun serviceOffers(@Header("Authorization") token: String,
                      @Header("Accept-Language")  language: String,
                      @Header("Content-Type") type: String,
                      @Path(value = "slug", encoded = true) slug: String): Observable<InquiresService>

    @GET("companies/memberships/")
    fun getMemberships(@Header("Authorization") token: String,
                       @Header("Content-Type") type: String) : Observable<List<Memberships>>

    @GET("companies/user/")
    fun getUserCompany(@Header("Authorization") token: String,
                       @Header("Accept-Language")  language: String) : Observable<List<ResultCompanies>>

    @GET("geo/cities/")
    fun getGeo(@Query("search") city:String,
               @Header("Content-Type") type: String,
               @Header("Accept-Language")  language: String) : Observable<Geo>

    @GET("geo/countries/")
    fun getCountries(@Header("Content-Type") type: String) : Observable<ArrayList<Countries>>

    @GET("tags/")
    fun getTags(@Header("Accept-Language")  language: String,
                @Header("Content-Type") type: String,
                @Query("search") tags:String) : Observable<Tags>

    @GET("service/tags/")
    fun getService(@Header("Accept-Language")  language: String,
                   @Header("Content-Type") type: String,
                   @Query("search") service:String) : Observable<Services>

    @GET
    fun getServiceSuppliers(@Header("Authorization") token: String,
                            @Header("Accept-Language")  language: String,
                            @Header("Content-Type") type: String,
                            @Url url :String) : Observable<Services>

    @GET("items/")
    fun getItemsAdmin(@Header("Authorization") token: String,
                      @Header("Accept-Language")  language: String,
                      @Header("Content-Type") type: String,
                      @Query("company") id:Int,
                      @Query("user") user: String) : Observable<ItemsAdmin>

    @GET("items/{slug}/")
    fun getItems(@Header("Authorization") token: String,
                 @Header("Accept-Language")  language: String,
                 @Header("Content-Type") type: String,
                 @Path(value = "slug", encoded = true) slug: String) : Observable<UpdateResults>

    @GET("service/{slug}/")
    fun getServiceUpdate(@Header("Authorization") token: String,
                         @Header("Accept-Language")  language: String,
                         @Header("Content-Type") type: String,
                         @Path(value = "slug", encoded = true) slug: String) : Observable<UpdateResults>

    @GET("items/{slug}/")
    fun getItemsPrice(@Header("Authorization") token: String,
                     @Path(value = "slug", encoded = true) slug: String) : Observable<ItemsCreatePrice>

    @POST("items/")
    fun createItems(@Header("Authorization") token: String,
                    @Header("Accept-Language")  language: String,
                    @Body body: ItemsCreateRaw): Observable<ItemsCreate>

    @POST("items/")
    fun createItemsPrice(@Header("Authorization") token: String,
                         @Header("Accept-Language")  language: String,
                         @Body body: ItemsCreatePrice): Observable<ItemsCreate>

    @GET("service/")
    fun getServiceAdmin(@Header("Authorization") token: String,
                        @Header("Accept-Language")  language: String,
                        @Header("Content-Type") type: String,
                        @Query("company") id:Int,
                        @Query("user") user: String) : Observable<ItemsAdmin>

    @GET("service/{slug}")
    fun getServiceMove(@Header("Authorization") token: String,
                       @Header("Accept-Language")  language: String,
                       @Header("Content-Type") type: String,
                       @Path(value = "slug", encoded = true) slug: String,
                       @Query("user")user: String): Observable<ResultItems>

    @DELETE("service/{slug}/")
    fun getServiceDelete(@Header("Authorization") token: String,
                         @Header("Accept-Language")  language: String,
                         @Header("Content-Type") type: String,
                         @Path(value = "slug", encoded = true) slug: String,
                         @Query("user")user: String): Completable

    @GET("items/{slug}")
    fun getItemsMove(@Header("Authorization") token: String,
                     @Header("Accept-Language")  language: String,
                     @Header("Content-Type") type: String,
                     @Path(value = "slug", encoded = true) slug: String,
                     @Query("user")user: String): Observable<ResultItems>

    @DELETE("items/{slug}/")
    fun getItemsDelete(@Header("Authorization") token: String,
                       @Header("Accept-Language")  language: String,
                       @Header("Content-Type") type: String,
                       @Path(value = "slug", encoded = true) slug: String,
                       @Query("user")user: String): Completable

    @POST("service/{slug}/published/")
    fun publish(@Header("Authorization") token: String,
                @Header("Accept-Language")  language: String,
                @Header("Content-Type") type: String,
                @Path(value = "slug", encoded = true) slug: String,
                @Query("user")user: String,
                @Body body: Publish): Completable

    @POST("items/{slug}/published/")
    fun publishItem(@Header("Authorization") token: String,
                    @Header("Accept-Language")  language: String,
                    @Header("Content-Type") type: String,
                    @Path(value = "slug", encoded = true) slug: String,
                    @Query("user")user: String,
                    @Body body: Publish): Completable



    @POST("service/")
    fun createServicePrice(@Header("Authorization") token: String,
                           @Header("Accept-Language")  language: String,
                           @Header("Content-Type") type: String,
                           @Body body: ItemsCreatePrice): Observable<ItemsCreate>

    @POST("service/")
    fun createService(@Header("Authorization") token: String,
                      @Header("Accept-Language")  language: String,
                      @Header("Content-Type") type: String,
                      @Body body: ItemsCreateRaw): Observable<ItemsCreate>

    @GET("internal/list")
    fun getNotifications(@Header("Cookie") cookie: String,
                         @Header("Content-Type") type: String,
                         @Header("Accept-Language")  language: String): Observable<List<Notifications>>

    @POST("internal/read")
    @FormUrlEncoded
    fun readNotifications(@Header("Cookie") cookie: String,
                          @Field("id") id : Int): Observable<ReadNotifications>


    @GET("search/")
    fun searchCompanies(@Header("X-Requested-With") xmlhhtpRequest: String,
                        @Header("Content-Type") type: String,
                        @Query("s") option:String,
                        @Query("q") searchKey: String,
                        @Query("page") page: Int) : Observable<SearchCompanies>

    @GET("search/")
    fun searchItems(@Header("X-Requested-With") xmlhhtpRequest: String,
                    @Header("Content-Type") type: String,
                    @Query("s") option:String,
                    @Query("q") searchKey: String,
                    @Query("page") page: Int) : Observable<Goods>

    @GET("search/")
    fun searchServices(@Header("X-Requested-With") xmlhhtpRequest: String,
                       @Header("Content-Type") type: String,
                       @Query("s") option:String,
                       @Query("q") searchKey: String,
                       @Query("page") page: Int) : Observable<SearchServices>
    @GET("search/")
    fun searchServicesCreate(@Header("X-Requested-With") xmlhhtpRequest: String,
                             @Header("Content-Type") type: String,
                             @Query("s") option:String,
                             @Query("q") searchKey: String) : Observable<SearchServices>
    @GET("search/")
    fun searchTenders(@Header("X-Requested-With") xmlhhtpRequest: String,
                      @Header("Content-Type") type: String,
                      @Query("s") option:String,
                      @Query("q") searchKey: String,
                      @Query("page") page: Int) : Observable<SearchTenders>*/
}