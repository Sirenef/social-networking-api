package com.social.networking.api.form.notification;

import com.social.networking.api.validation.NotificationKind;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class CreateNotificationForm {
    @ApiModelProperty(name = "content", required = true)
    @NotEmpty(message = "content cannot be empty!")
    private String content;
    @ApiModelProperty(name = "kind", required = true, notes = "1: New post of following, 2: Comment in my post, 3: Reaction my post, 4: Reaction my comment, 5: New follower")
    @NotificationKind
    private Integer kind;
    @ApiModelProperty(name = "objectId", required = true)
    @NotNull(message = "objectId cannot be null!")
    private Long objectId;
}
