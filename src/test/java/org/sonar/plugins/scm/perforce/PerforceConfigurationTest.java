/*
 * SonarQube :: Plugins :: SCM :: Perforce
 * Copyright (C) 2014 SonarSource
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.plugins.scm.perforce;

import org.junit.Test;
import org.sonar.api.config.PropertyDefinitions;
import org.sonar.api.config.Settings;

import static org.fest.assertions.Assertions.assertThat;

public class PerforceConfigurationTest {

  @Test
  public void checkDefaultValues() {
    Settings settings = new Settings(new PropertyDefinitions(PerforceConfiguration.getProperties()));

    PerforceConfiguration config = new PerforceConfiguration(settings);
    assertThat(config.charset()).isNull();
    assertThat(config.clientName()).isNull();
    assertThat(config.port()).isNull();
    assertThat(config.username()).isNull();
    assertThat(config.password()).isNull();
    assertThat(config.useSsl()).isFalse();
  }
}
