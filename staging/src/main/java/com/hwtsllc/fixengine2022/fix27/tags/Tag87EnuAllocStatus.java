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
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

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
public class Tag87EnuAllocStatus extends FIX27Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum87AllocStatus dataValue;

    public final static Enum87AllocStatus TESTA_ENU_ALLOC_STATUS = Enum87AllocStatus.ACCEPTED;
    public final static Enum87AllocStatus TESTB_ENU_ALLOC_STATUS = Enum87AllocStatus.ALLOCATION_PENDING;

    public Tag87EnuAllocStatus(Enum87AllocStatus dataValue) {
        setFixType(FIX27.FIX87_ENU_ALLOC_STATUS);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toFixTagValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toLogStringVerbose() {
        return super.toLogStringVerbose()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing the data
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
        Tag87EnuAllocStatus tagData;

        tagData = new Tag87EnuAllocStatus(TESTA_ENU_ALLOC_STATUS);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag87EnuAllocStatus(TESTB_ENU_ALLOC_STATUS);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}