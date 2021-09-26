package com.discovery.sonic.recruitment;

import java.util.Objects;
import java.util.UUID;

public class Video {

  private final UUID id;
  private final String title;

  public Video(final UUID id, final String title) {
    this.id = id;
    this.title = title;
  }

  public UUID getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var video = (Video) o;
    return id.equals(video.id) && title.equals(video.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title);
  }
}
