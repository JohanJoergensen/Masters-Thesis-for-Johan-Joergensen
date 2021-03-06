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

package energy.usef.agr.workflow.nonudi.dto;

import java.math.BigDecimal;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.joda.time.LocalDateTime;

/**
 * DTO class for the status of an Objective Agent.
 */
public class ObjectiveAgentStatusDto {

    @JsonProperty(value = "current_target")
    private BigDecimal currentTarget;
    @JsonProperty(value = "min_allocation")
    private BigDecimal minAllocation;
    @JsonProperty(value = "max_allocation")
    private BigDecimal maxAllocation;
    @JsonProperty(value = "current_allocation")
    private BigDecimal currentAllocation;
    @JsonProperty(value = "last_update")
    @JsonDeserialize(using=LocalDateTimeDeserializer.class)
    private LocalDateTime lastUpdate;

    public BigDecimal getCurrentTarget() {
        return currentTarget;
    }

    public void setCurrentTarget(BigDecimal currentTarget) {
        this.currentTarget = currentTarget;
    }

    public BigDecimal getMinAllocation() {
        return minAllocation;
    }

    public void setMinAllocation(BigDecimal minAllocation) {
        this.minAllocation = minAllocation;
    }

    public BigDecimal getMaxAllocation() {
        return maxAllocation;
    }

    public void setMaxAllocation(BigDecimal maxAllocation) {
        this.maxAllocation = maxAllocation;
    }

    public BigDecimal getCurrentAllocation() {
        return currentAllocation;
    }

    public void setCurrentAllocation(BigDecimal currentAllocation) {
        this.currentAllocation = currentAllocation;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "ObjectiveAgentStatusDto" + "[" +
                "currentTarget=" + currentTarget +
                ", minAllocation=" + minAllocation +
                ", maxAllocation=" + maxAllocation +
                ", currentAllocation=" + currentAllocation +
                ", lastUpdate=" + lastUpdate +
                "]";
    }
}
