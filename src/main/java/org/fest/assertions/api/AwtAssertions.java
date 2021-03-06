/*
 * Created on June 18, 2012
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2010-2012 the original author or authors.
 */
package org.fest.assertions.api;

import java.awt.image.BufferedImage;

/**
 * Entry point for assertion methods for java.awt data types. Each method in this class is a static factory for the
 * type-specific assertion objects. The purpose of this class is to make test code more readable.
 * <p>
 * For example:
 *
 * <pre>
 * BufferedImage image = new BufferedImage(10, 10, TYPE_INT_RGB);
 * {@link AwtAssertions#assertThat(java.awt.image.BufferedImage) assertThat}(image).{@link ImageAssert#hasSize(java.awt.Dimension) hasSize}(new Dimension(10, 10));
 * </pre>
 * </p>
 * @author Tobias Gesellchen
 */
public class AwtAssertions {

  /**
   * Creates a new instance of <code>{@link ImageAssert}</code>. To read an image from the file system use
   * <code>{@link ImageReader#readImageFrom(String)}</code>.
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static ImageAssert assertThat(BufferedImage actual) {
    return new ImageAssert(actual);
  }
}
