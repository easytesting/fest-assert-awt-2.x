package org.fest.assertions.api.awt;

import org.fest.assertions.api.factories.AssertionFactory;

import java.awt.image.BufferedImage;

public class ImageAssertionFactory implements AssertionFactory<BufferedImage, ImageAssert> {

  public ImageAssert assertThat(BufferedImage actual) {
    return new ImageAssert(actual);
  }

  public boolean supports(Object actual) {
    return actual.getClass().isAssignableFrom(BufferedImage.class);
  }
}
