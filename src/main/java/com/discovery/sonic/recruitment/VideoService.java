package com.discovery.sonic.recruitment;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class VideoService {

  private final Map<UUID, Video> videosById = new HashMap<>();

  public Video createVideo(String title) {
    var id = UUID.randomUUID();
    Video createVideo = new Video(id, title);
    //var video = new Video(id, title);
    videosById.put(id, createVideo);
    return createVideo;
  }

  public Video getVideo(UUID id) {
    return videosById.get(id);
  }
}
