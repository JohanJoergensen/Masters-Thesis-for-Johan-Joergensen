/*
 * Copyright 2015-2016 USEF Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package energy.usef.core.event;

import org.joda.time.LocalDate;

/**
 * Event that will trigger cleaning up database
 */
public class HousekeepingEvent implements ExpirableEvent {
    private final LocalDate period;

    /**
     * Constructor.
     *
     * @param period {@link LocalDate}.
     */
    public HousekeepingEvent(LocalDate period) {
        this.period = period;
    }

    public LocalDate getPeriod() {
        return period;
    }

    @Override
    public String toString() {
        return "HousekeepingEvent" + "[" +
                "period=" + period +
                "]";
    }
}
