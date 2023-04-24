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

package com.hwtsllc.fixengine.tags.fix43.tags;

import com.hwtsllc.fixengine.datatypes.FIX43;
import com.hwtsllc.fixengine.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine.tags.fix43.enums.Enum638PriorityIndicator;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  638
 *  PriorityIndicator
 *  int
 *  <p></p>
 *  Indicates if a Cancel/Replace has caused an order to lose book priority.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Priority unchanged
 *  <p>    1 - Lost Priority as result of order change
 */
public class Tag638EnuPriorityIndicator extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum638PriorityIndicator dataValue;

    public final static Enum638PriorityIndicator TESTA_ENU_PRIORITY_INDICATOR
            = Enum638PriorityIndicator.LOST_PRIORITY;
    public final static Enum638PriorityIndicator TESTB_ENU_PRIORITY_INDICATOR
            = Enum638PriorityIndicator.PRIORITY_UNCHANGED;

    public Tag638EnuPriorityIndicator(Enum638PriorityIndicator dataValue) {
        setFixType(FIX43.FIX638_ENU_PRIORITY_INDICATOR);
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
        return dataValue.toFIXDescriptionString();
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
        Tag638EnuPriorityIndicator tagData;

        tagData = new Tag638EnuPriorityIndicator(TESTA_ENU_PRIORITY_INDICATOR);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag638EnuPriorityIndicator(TESTB_ENU_PRIORITY_INDICATOR);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum638PriorityIndicator oneEnum : Enum638PriorityIndicator.values()) {
            System.out.println( new Tag638EnuPriorityIndicator(oneEnum).toVerboseString() );
        }
    }
}
