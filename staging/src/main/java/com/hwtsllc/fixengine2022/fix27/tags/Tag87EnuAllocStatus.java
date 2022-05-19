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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine2022.fix27.enums.Enum87AllocStatus;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  87
 *  AllocStatus
 *  int
 *  Identifies status of allocation.
 *  Valid values:
 *      0 - accepted (successfully processed)
 *      1 - block level reject
 *      2 - account level reject
 *      3 - received (received, not yet processed)
 *      4 - incomplete
 *      5 - rejected by intermediary
 *      6 - allocation pending
 *      7 - reversed
 */
public class Tag87EnuAllocStatus extends FIX27Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum87AllocStatus dataValue;

    public final static Enum87AllocStatus TESTA_ENU_ALLOC_STATUS
            = Enum87AllocStatus.ACCEPTED;
    public final static Enum87AllocStatus TESTB_ENU_ALLOC_STATUS
            = Enum87AllocStatus.ALLOCATION_PENDING;

    public Tag87EnuAllocStatus(Enum87AllocStatus dataValue) {
        setFixType(FIX27.FIX87_ENU_ALLOC_STATUS);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]")
                .concat("\n\tValuePair[")
                .concat(toValuePairString())
                .concat("]")
                .concat("\n\tDataID[")
                .concat(toDataIDString())
                .concat("]")
                .concat("\n\tDataName[")
                .concat(toDataNameString())
                .concat("]")
                .concat("\n\tDataDescription[")
                .concat(toDataDescriptionString())
                .concat("]")
                ;
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toFIXDescriptionString();
    }
    /**
     * standard wrapper to return a string describing the data
     */
    @Override
    public String toString() {
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        System.out.println( new Tag87EnuAllocStatus(TESTA_ENU_ALLOC_STATUS).toVerboseString() );
        System.out.println( new Tag87EnuAllocStatus(TESTB_ENU_ALLOC_STATUS).toVerboseString() );

        // loop around the ENUM and display
        for (Enum87AllocStatus oneEnum : Enum87AllocStatus.values()) {
            System.out.println( new Tag87EnuAllocStatus(oneEnum).toVerboseString() );
        }
    }
}