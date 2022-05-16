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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyEnumApplQueue;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  814 (same as 814, 815)
 *  ApplQueueResolution
 *  int
 *  <p>
 *  Resolution taken when ApplQueueDepth (813) exceeds ApplQueueMax (812)
 *  or system specified maximum queue size.
 *  <p></p>
 *  815 (same as 814, 815)
 *  ApplQueueAction
 *  int
 *  <p>
 *  Action to take to resolve an application message queue (backlog).
 *  <p></p>
 *  Valid values:
 *  <p>    0 - No Action Taken
 *  <p>    1 - Queue Flushed
 *  <p>    2 - Overlay Last
 *  <p>    3 - End Session
 */
public class Tag814EnuApplQueueResolution extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final MyEnumApplQueue dataValue;

    public final static MyEnumApplQueue TESTA_ENU_APPL_QUEUE_RESOLUTION
            = MyEnumApplQueue.QUEUE_FLUSHED;
    public final static MyEnumApplQueue TESTB_ENU_APPL_QUEUE_RESOLUTION
            = MyEnumApplQueue.NO_ACTION;

    public Tag814EnuApplQueueResolution(MyEnumApplQueue dataValue) {
        setFixType(FIX44.FIX814_ENU_APPL_QUEUE_RESOLUTION);
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
                .concat("]");
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
        Tag814EnuApplQueueResolution tagData;

        tagData = new Tag814EnuApplQueueResolution(TESTA_ENU_APPL_QUEUE_RESOLUTION);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag814EnuApplQueueResolution(TESTB_ENU_APPL_QUEUE_RESOLUTION);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
