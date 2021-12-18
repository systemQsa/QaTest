package rest.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

//@JsonDeserialize(as = CreatedBoardDto.class)
@Data
@AllArgsConstructor
//@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
//@AllArgsConstructor(onConstructor = @__(@JsonCreator(mode = JsonCreator.Mode.PROPERTIES)))
public class CreatedBoardDto implements Serializable {
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("desc")
    private String desc;
    @JsonProperty("descData")
    private Object descData;
    @JsonProperty("closed")
    private boolean closed;
    @JsonProperty("idOrganization")
    private String idOrganization;
    @JsonProperty("idEnterprise")
    private Object idEnterprise;
    @JsonProperty("pinned")
    private boolean pinned;
    @JsonProperty("url")
    private String url;
    @JsonProperty("shortUrl")
    private String shortUrl;
    private Prefs prefs;

    private LabelNames labelNames;

    private Limits limits;


    @Data
    //@AllArgsConstructor(onConstructor = @__(@JsonCreator(mode = JsonCreator.Mode.PROPERTIES)))
    //@JsonDeserialize(as = Prefs.class)
//    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    @AllArgsConstructor
    public static class Prefs  implements Serializable{
        private String permissionLevel;
        private boolean hideVotes;
        private String voting;
        private String comments;
        private String invitations;
        private boolean selfJoin;
        private boolean cardCovers;
        private boolean isTemplate;
        private String cardAging;
        private boolean calendarFeedEnabled;
        private boolean isPluginHeaderShortcutsEnabled;
        private List<Object> enabledPluginBoardButtons;
        private String background;
        private Object backgroundImage;
        private Object backgroundImageScaled;
        private boolean backgroundTile;
        private String backgroundBrightness;
        private String backgroundColor;
        private String backgroundBottomColor;
        private String backgroundTopColor;
        private boolean canBePublic;
        private boolean canBeEnterprise;
        private boolean canBeOrg;
        private boolean canBePrivate;
        private boolean canInvite;

    }

    //@JsonDeserialize(as = LabelNames.class)
    @Data
    //@AllArgsConstructor(onConstructor = @__(@JsonCreator(mode = JsonCreator.Mode.PROPERTIES)))
    @AllArgsConstructor
//    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    public static class LabelNames  implements Serializable{
        private String green;
        private String yellow;
        private String orange;
        private String red;
        private String purple;
        private String blue;
        private String sky;
        private String lime;
        private String pink;
        private String black;

    }

   // @JsonDeserialize(as = Limits.class)
    @Data
    @AllArgsConstructor
   // @AllArgsConstructor(onConstructor = @__(@JsonCreator(mode = JsonCreator.Mode.PROPERTIES)))
//    @JsonDeserialize(as = Limits.class)
//    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    public static class Limits  implements Serializable{

    }

}


