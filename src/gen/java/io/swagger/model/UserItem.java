/*
 * Service_01_User_API
 * Remembranza Project is a response to the need of dealing with mental diseases in advanced ages
 *
 * OpenAPI spec version: 1.0.0
 * Contact: mjesusaz@alumnos.unex.es
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;


import java.util.Objects;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AchievementItem;
import io.swagger.model.DestinationItem;
import io.swagger.model.MementoItem;
import io.swagger.model.ReportItem;
import io.swagger.model.WarningItem;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;



import javax.validation.constraints.*;




/**
 * UserItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T18:06:22.527Z[GMT]")
public class UserItem   {
  
    
      
  
  @JsonProperty("id_user")
  
  
  
  
  private UUID idUser = null;
  

  
    
      
  
  @JsonProperty("name")
  
  
  
  
  private String name = null;
  

  
    
      
  
  @JsonProperty("birthday")
  
  
  
  
  private Date birthday = null;
  

  
    
      
  
  @JsonProperty("destinations")
  
  
  
  private List<DestinationItem> destinations = new ArrayList<DestinationItem>();
  
  

  
    
      
  
  @JsonProperty("mementos")
  
  
  
  private List<MementoItem> mementos = new ArrayList<MementoItem>();
  
  

  
    
      
  
  @JsonProperty("achievements")
  
  
  
  private List<AchievementItem> achievements = new ArrayList<AchievementItem>();
  
  

  
    
      
  
  @JsonProperty("warnings")
  
  
  
  private List<WarningItem> warnings = new ArrayList<WarningItem>();
  
  

  
    
      
  
  @JsonProperty("reports")
  
  
  
  private List<ReportItem> reports = new ArrayList<ReportItem>();
  
  

  
  
  
  public UserItem idUser(UUID idUser) {
    this.idUser = idUser;
    return this;
  }
  
  

  
  /**
  
  
   * Get idUser
  
  
  
   * @return idUser
   **/
 
  
  @JsonProperty("id_user")
  
  @ApiModelProperty(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", required = true, value = "")

  @NotNull

  public UUID getIdUser() {
    return idUser;
  }
  

  public void setIdUser(UUID idUser) {
    this.idUser = idUser;
  }
  

  
  
  public UserItem name(String name) {
    this.name = name;
    return this;
  }
  
  

  
  /**
  
  
   * Get name
  
  
  
   * @return name
   **/
 
  
  @JsonProperty("name")
  
  @ApiModelProperty(example = "Keyser Söze", required = true, value = "")

  @NotNull

  public String getName() {
    return name;
  }
  

  public void setName(String name) {
    this.name = name;
  }
  

  
  
  public UserItem birthday(Date birthday) {
    this.birthday = birthday;
    return this;
  }
  
  

  
  /**
  
  
   * Get birthday
  
  
  
   * @return birthday
   **/
 
  
  @JsonProperty("birthday")
  
  @ApiModelProperty(required = true, value = "")

  @NotNull

  public Date getBirthday() {
    return birthday;
  }
  

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }
  

  
  
  public UserItem destinations(List<DestinationItem> destinations) {
    this.destinations = destinations;
    return this;
  }
  

  public UserItem addDestinationsItem(DestinationItem destinationsItem) {
    
    this.destinations.add(destinationsItem);
    return this;
  }
  
  

  
  /**
  
  
   * Get destinations
  
  
  
   * @return destinations
   **/
 
  
  @JsonProperty("destinations")
  
  @ApiModelProperty(required = true, value = "")

  @NotNull

  public List<DestinationItem> getDestinations() {
    return destinations;
  }
  

  public void setDestinations(List<DestinationItem> destinations) {
    this.destinations = destinations;
  }
  

  
  
  public UserItem mementos(List<MementoItem> mementos) {
    this.mementos = mementos;
    return this;
  }
  

  public UserItem addMementosItem(MementoItem mementosItem) {
    
    this.mementos.add(mementosItem);
    return this;
  }
  
  

  
  /**
  
  
   * Get mementos
  
  
  
   * @return mementos
   **/
 
  
  @JsonProperty("mementos")
  
  @ApiModelProperty(required = true, value = "")

  @NotNull

  public List<MementoItem> getMementos() {
    return mementos;
  }
  

  public void setMementos(List<MementoItem> mementos) {
    this.mementos = mementos;
  }
  

  
  
  public UserItem achievements(List<AchievementItem> achievements) {
    this.achievements = achievements;
    return this;
  }
  

  public UserItem addAchievementsItem(AchievementItem achievementsItem) {
    
    this.achievements.add(achievementsItem);
    return this;
  }
  
  

  
  /**
  
  
   * Get achievements
  
  
  
   * @return achievements
   **/
 
  
  @JsonProperty("achievements")
  
  @ApiModelProperty(required = true, value = "")

  @NotNull

  public List<AchievementItem> getAchievements() {
    return achievements;
  }
  

  public void setAchievements(List<AchievementItem> achievements) {
    this.achievements = achievements;
  }
  

  
  
  public UserItem warnings(List<WarningItem> warnings) {
    this.warnings = warnings;
    return this;
  }
  

  public UserItem addWarningsItem(WarningItem warningsItem) {
    
    this.warnings.add(warningsItem);
    return this;
  }
  
  

  
  /**
  
  
   * Get warnings
  
  
  
   * @return warnings
   **/
 
  
  @JsonProperty("warnings")
  
  @ApiModelProperty(required = true, value = "")

  @NotNull

  public List<WarningItem> getWarnings() {
    return warnings;
  }
  

  public void setWarnings(List<WarningItem> warnings) {
    this.warnings = warnings;
  }
  

  
  
  public UserItem reports(List<ReportItem> reports) {
    this.reports = reports;
    return this;
  }
  

  public UserItem addReportsItem(ReportItem reportsItem) {
    
    this.reports.add(reportsItem);
    return this;
  }
  
  

  
  /**
  
  
   * Get reports
  
  
  
   * @return reports
   **/
 
  
  @JsonProperty("reports")
  
  @ApiModelProperty(required = true, value = "")

  @NotNull

  public List<ReportItem> getReports() {
    return reports;
  }
  

  public void setReports(List<ReportItem> reports) {
    this.reports = reports;
  }
  

  


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserItem userItem = (UserItem) o;
    return Objects.equals(this.idUser, userItem.idUser) &&
        Objects.equals(this.name, userItem.name) &&
        Objects.equals(this.birthday, userItem.birthday) &&
        Objects.equals(this.destinations, userItem.destinations) &&
        Objects.equals(this.mementos, userItem.mementos) &&
        Objects.equals(this.achievements, userItem.achievements) &&
        Objects.equals(this.warnings, userItem.warnings) &&
        Objects.equals(this.reports, userItem.reports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idUser, name, birthday, destinations, mementos, achievements, warnings, reports);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserItem {\n");
    
    sb.append("    idUser: ").append(toIndentedString(idUser)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    destinations: ").append(toIndentedString(destinations)).append("\n");
    sb.append("    mementos: ").append(toIndentedString(mementos)).append("\n");
    sb.append("    achievements: ").append(toIndentedString(achievements)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}



