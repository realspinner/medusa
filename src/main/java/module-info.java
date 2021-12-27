/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Copyright 2016-2021 Gerrit Grunwald.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
module eu.hansolo.medusa {

    // Java
    requires java.base;

    // Java-FX
    requires transitive javafx.base;
    requires transitive javafx.graphics;
    requires transitive javafx.controls;

    // 3rd party
    requires transitive eu.hansolo.toolbox;
    requires transitive eu.hansolo.toolbox.evt;
    requires transitive eu.hansolo.toolbox.evt.type;

    exports eu.hansolo.medusa;
    exports eu.hansolo.medusa.skins;
    exports eu.hansolo.medusa.events;
    exports eu.hansolo.medusa.tools;
}
