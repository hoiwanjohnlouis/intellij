/*
 * Copyright (c) 2022.  HW Tech Services, LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.hwtsllc.fixengine2022.datatypes;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public enum Enum87AllocStatus {
    ACCEPTED("0", "ACCEPTED", "accepted (successfully processed)" ),
    BLOCK_LEVEL_REJECT("1", "BLOCK_LEVEL_REJECT", "block level reject" ),
    ACCOUNT_LEVEL_REJECT("2", "ACCOUNT_LEVEL_REJECT", "account level reject" ),
    RECEIVED_NOT_PROCESSED("3", "RECEIVED_NOT_PROCESSED", "received (received, not yet processed)" ),
    INCOMPLETE("4", "INCOMPLETE", "incomplete" ),
    REJECTED_BY_INTERMEDIARY("5", "REJECTED_BY_INTERMEDIARY", "rejected by intermediary" ),
    ALLOCATION_PENDING("6", "ALLOCATION_PENDING", "allocation pending" ),
    REVERSED("7", "REVERSED", "reversed" ),
    ;

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String action;
    private final String name;
    private final String description;

    Enum87AllocStatus(final String action, final String name, final String description) {
        this.action = action;
        this.name = name;
        this.description = description;
    }

    public String getEnumName() {
        return this.name();
    }
    public String getAction() {
        return action;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getEnumName())
                .append("=[")
                .append(getAction())
                .append(",")
                .append(getName())
                .append(",")
                .append(getDescription())
                .append("]");
        return sb.toString();
    }
    public String toLogStringVerbose() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName())
                .append("\n\tEnumName[")
                .append(getEnumName())
                .append("]")
                .append("\n\tAction[")
                .append(getAction())
                .append("]")
                .append("\n\tName[")
                .append(getName())
                .append("]")
                .append("\n\tDescription[")
                .append(getDescription())
                .append("]");
        return sb.toString();
    }

    /**
     *
     */
    public static void main(String[] args) {
        System.out.println(Enum87AllocStatus.ACCEPTED);
        System.out.println(Enum87AllocStatus.BLOCK_LEVEL_REJECT);
        System.out.println(Enum87AllocStatus.ACCOUNT_LEVEL_REJECT);
        System.out.println(Enum87AllocStatus.RECEIVED_NOT_PROCESSED);
        System.out.println(Enum87AllocStatus.INCOMPLETE);
        System.out.println(Enum87AllocStatus.REJECTED_BY_INTERMEDIARY);
        System.out.println(Enum87AllocStatus.ALLOCATION_PENDING);
        System.out.println(Enum87AllocStatus.REVERSED);
    }
}
