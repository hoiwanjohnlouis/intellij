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

package com.hwtsllc.fixengine.tags.fix42;

import com.hwtsllc.fixengine.datatypes.FIX42;
import com.hwtsllc.fixengine.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine.enums.fix42.Enum325UnsolicitedIndicator;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  325
 *  UnsolicitedIndicator
 *  Boolean
 *  <p>
 *  Indicates whether or not message is being sent as a result of a subscription request or not.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Message is being sent as a result of a prior request
 *  <p>    Y - Message is being sent unsolicited
 */
public class Tag325EnulUnsolicitedIndicator extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum325UnsolicitedIndicator dataValue;

    public final static Enum325UnsolicitedIndicator TESTA_ENU_UNSOLICITED_INDICATOR
            = Enum325UnsolicitedIndicator.NO ;
    public final static Enum325UnsolicitedIndicator TESTB_ENU_UNSOLICITED_INDICATOR
            = Enum325UnsolicitedIndicator.YES;

    public Tag325EnulUnsolicitedIndicator(Enum325UnsolicitedIndicator dataValue) {
        setFixType(FIX42.FIX325_ENU_UNSOLICITED_INDICATOR);
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
        Tag325EnulUnsolicitedIndicator tagData;

        tagData = new Tag325EnulUnsolicitedIndicator(TESTA_ENU_UNSOLICITED_INDICATOR);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag325EnulUnsolicitedIndicator(TESTB_ENU_UNSOLICITED_INDICATOR);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum325UnsolicitedIndicator oneEnum : Enum325UnsolicitedIndicator.values()) {
            System.out.println( new Tag325EnulUnsolicitedIndicator(oneEnum).toVerboseString() );
        }
    }
}
