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

package energy.usef.dso.workflow.settlement.collect;

import energy.usef.core.data.xml.bean.message.MeterData;
import energy.usef.core.data.xml.bean.message.MeterDataSet;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;

/**
 * Event implementation for the Finalize Collect Orange Regime.
 */
public class FinalizeCollectOrangeRegimeDataEvent {
    private List<MeterDataSet> meterDataSets;
    private LocalDate period;

    /**
     * Default constructor.
     *
     * @param meterDataSets
     * @param period period
     */
    public FinalizeCollectOrangeRegimeDataEvent(List<MeterDataSet> meterDataSets,
            LocalDate period) {
        this.meterDataSets = meterDataSets;
        this.period = period;
    }

    /**
     * Get List of {@link MeterData}.
     *
     * @return the meterdataList
     */
    public List<MeterDataSet> getMeterDataSets() {
        if (meterDataSets == null) {
            meterDataSets = new ArrayList<>();
        }
        return meterDataSets;
    }

    public LocalDate getPeriod() {
        return period;
    }

    @Override
    public String toString() {
        return "FinalizeCollectOrangeRegimeDataEvent" + "[" +
                "#meterDataSets=" + meterDataSets.size() +
                ", period=" + period +
                "]";
    }
}
