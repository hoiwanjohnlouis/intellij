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
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  815
 *  ApplQueueAction
 *  int
 *  Action to take to resolve an application message queue (backlog).
 *  Valid values:
 *      0 - No Action Taken
 *      1 - Queue Flushed
 *      2 - Overlay Last
 *      3 - End Session
 */
public class Tag815EnuApplQueueAction extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final MyEnumApplQueue dataValue;

    public final static MyEnumApplQueue TESTA_ENU_APPL_QUEUE_ACTION
            = MyEnumApplQueue.END_SESSION;
    public final static MyEnumApplQueue TESTB_ENU_APPL_QUEUE_ACTION
            = MyEnumApplQueue.OVERLAY_LAST;

    public Tag815EnuApplQueueAction(MyEnumApplQueue dataValue) {
        setFixType(FIX44.FIX815_ENU_APPL_QUEUE_ACTION);
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
        Tag815EnuApplQueueAction tagData;

        tagData = new Tag815EnuApplQueueAction(TESTA_ENU_APPL_QUEUE_ACTION);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag815EnuApplQueueAction(TESTB_ENU_APPL_QUEUE_ACTION);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
