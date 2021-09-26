package com.discovery.sonic.recruitment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.UUID;
import org.junit.jupiter.api.Test;

class VideoServiceTest {

  private final VideoService videoService = new VideoService();

  @Test
  void create_video_returns_the_video() {
    var title = "Big Bang Theory - Episode " + randomUUID();

    var video = videoService.createVideo(title);

    assertEquals(title, video.getTitle());
    assertNotNull(video.getId());
  }

  @Test
  void get_video_returns_the_video() {
    var title = "Big Bang Theory - Episode " + randomUUID();
    var video = videoService.createVideo(title);
    var savedVideo = videoService.getVideo(video.getId());
    assertEquals(video, savedVideo);
  }

  private String randomUUID() {
    return UUID.randomUUID().toString();
  }
  
  @Test
  void check_video_id() {
	  var id = UUID.randomUUID();
	  var video = videoService.getVideo(id);
	  assertEquals(video, null);
  }
}
