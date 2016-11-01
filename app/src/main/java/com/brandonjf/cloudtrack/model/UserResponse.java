package com.brandonjf.cloudtrack.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
public class UserResponse {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("permalink")
    @Expose
    private String permalink;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("last_modified")
    @Expose
    private String lastModified;
    @SerializedName("uri")
    @Expose
    private String uri;
    @SerializedName("permalink_url")
    @Expose
    private String permalinkUrl;
    @SerializedName("avatar_url")
    @Expose
    private String avatarUrl;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("discogs_name")
    @Expose
    private Object discogsName;
    @SerializedName("myspace_name")
    @Expose
    private Object myspaceName;
    @SerializedName("website")
    @Expose
    private Object website;
    @SerializedName("website_title")
    @Expose
    private Object websiteTitle;
    @SerializedName("track_count")
    @Expose
    private Integer trackCount;
    @SerializedName("playlist_count")
    @Expose
    private Integer playlistCount;
    @SerializedName("online")
    @Expose
    private Boolean online;
    @SerializedName("plan")
    @Expose
    private String plan;
    @SerializedName("public_favorites_count")
    @Expose
    private Integer publicFavoritesCount;
    @SerializedName("subscriptions")
    @Expose
    private List<Object> subscriptions = new ArrayList<Object>();
    @SerializedName("followers_count")
    @Expose
    private Integer followersCount;
    @SerializedName("followings_count")
    @Expose
    private Integer followingsCount;

    /**
     * @return The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return The kind
     */
    public String getKind() {
        return kind;
    }

    /**
     * @param kind The kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * @return The permalink
     */
    public String getPermalink() {
        return permalink;
    }

    /**
     * @param permalink The permalink
     */
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    /**
     * @return The username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username The username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return The lastModified
     */
    public String getLastModified() {
        return lastModified;
    }

    /**
     * @param lastModified The last_modified
     */
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * @return The uri
     */
    public String getUri() {
        return uri;
    }

    /**
     * @param uri The uri
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * @return The permalinkUrl
     */
    public String getPermalinkUrl() {
        return permalinkUrl;
    }

    /**
     * @param permalinkUrl The permalink_url
     */
    public void setPermalinkUrl(String permalinkUrl) {
        this.permalinkUrl = permalinkUrl;
    }

    /**
     * @return The avatarUrl
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * @param avatarUrl The avatar_url
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     * @return The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return The firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName The first_name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return The lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName The last_name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return The fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName The full_name
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return The description
     */
    public Object getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    public void setDescription(Object description) {
        this.description = description;
    }

    /**
     * @return The city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return The discogsName
     */
    public Object getDiscogsName() {
        return discogsName;
    }

    /**
     * @param discogsName The discogs_name
     */
    public void setDiscogsName(Object discogsName) {
        this.discogsName = discogsName;
    }

    /**
     * @return The myspaceName
     */
    public Object getMyspaceName() {
        return myspaceName;
    }

    /**
     * @param myspaceName The myspace_name
     */
    public void setMyspaceName(Object myspaceName) {
        this.myspaceName = myspaceName;
    }

    /**
     * @return The website
     */
    public Object getWebsite() {
        return website;
    }

    /**
     * @param website The website
     */
    public void setWebsite(Object website) {
        this.website = website;
    }

    /**
     * @return The websiteTitle
     */
    public Object getWebsiteTitle() {
        return websiteTitle;
    }

    /**
     * @param websiteTitle The website_title
     */
    public void setWebsiteTitle(Object websiteTitle) {
        this.websiteTitle = websiteTitle;
    }

    /**
     * @return The trackCount
     */
    public Integer getTrackCount() {
        return trackCount;
    }

    /**
     * @param trackCount The track_count
     */
    public void setTrackCount(Integer trackCount) {
        this.trackCount = trackCount;
    }

    /**
     * @return The playlistCount
     */
    public Integer getPlaylistCount() {
        return playlistCount;
    }

    /**
     * @param playlistCount The playlist_count
     */
    public void setPlaylistCount(Integer playlistCount) {
        this.playlistCount = playlistCount;
    }

    /**
     * @return The online
     */
    public Boolean getOnline() {
        return online;
    }

    /**
     * @param online The online
     */
    public void setOnline(Boolean online) {
        this.online = online;
    }

    /**
     * @return The plan
     */
    public String getPlan() {
        return plan;
    }

    /**
     * @param plan The plan
     */
    public void setPlan(String plan) {
        this.plan = plan;
    }

    /**
     * @return The publicFavoritesCount
     */
    public Integer getPublicFavoritesCount() {
        return publicFavoritesCount;
    }

    /**
     * @param publicFavoritesCount The public_favorites_count
     */
    public void setPublicFavoritesCount(Integer publicFavoritesCount) {
        this.publicFavoritesCount = publicFavoritesCount;
    }

    /**
     * @return The subscriptions
     */
    public List<Object> getSubscriptions() {
        return subscriptions;
    }

    /**
     * @param subscriptions The subscriptions
     */
    public void setSubscriptions(List<Object> subscriptions) {
        this.subscriptions = subscriptions;
    }

    /**
     * @return The followersCount
     */
    public Integer getFollowersCount() {
        return followersCount;
    }

    /**
     * @param followersCount The followers_count
     */
    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    /**
     * @return The followingsCount
     */
    public Integer getFollowingsCount() {
        return followingsCount;
    }

    /**
     * @param followingsCount The followings_count
     */
    public void setFollowingsCount(Integer followingsCount) {
        this.followingsCount = followingsCount;
    }

}