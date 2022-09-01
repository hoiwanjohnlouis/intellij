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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine2022.fix50.enums.Enum1101TriggerAction;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  1101
 *  TriggerAction
 *  char
 *  <p>
 *  Defines the type of action to take when the trigger hits.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Activate
 *  <p>    2 - Modify
 *  <p>    3 - Cancel
 */
public class Tag1101EnuTriggerAction extends FIX50Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum1101TriggerAction dataValue;

    public final static Enum1101TriggerAction TESTA_ENU_TRIGGER_ACTION
            = Enum1101TriggerAction.MODIFY;
    public final static Enum1101TriggerAction TESTB_ENU_TRIGGER_ACTION
            = Enum1101TriggerAction.ACTIVATE;

    public Tag1101EnuTriggerAction(Enum1101TriggerAction dataValue) {
        setFixType(FIX50.FIX1101_ENU_TRIGGER_ACTION);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(dataValue.toString());
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
        return dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return dataValue.toEnumDescriptionString();
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag1101EnuTriggerAction tagData;

        tagData = new Tag1101EnuTriggerAction(TESTA_ENU_TRIGGER_ACTION);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1101EnuTriggerAction(TESTB_ENU_TRIGGER_ACTION);
        System.out.println(tagData.toVerboseString());
    }
}
