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
import com.hwtsllc.fixengine2022.fix44.enums.Enum700ReversalIndicator;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  700
 *  ReversalIndicator
 *  Boolean
 *  <p></p>
 *  Indicates a trade that reverses a previous trade.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Do Not Reverse Previous Trade
 *  <p>    Y - Reverse Previous Trade
 */
public class Tag700EnuReversalIndicator extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum700ReversalIndicator dataValue;

    public final static Enum700ReversalIndicator TESTA_ENU_REVERSAL_INDICATOR
            = Enum700ReversalIndicator.NO ;
    public final static Enum700ReversalIndicator TESTB_ENU_REVERSAL_INDICATOR
            = Enum700ReversalIndicator.YES;

    public Tag700EnuReversalIndicator( Enum700ReversalIndicator dataValue) {
        setFixType(FIX44.FIX700_ENU_REVERSAL_INDICATOR );
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.toEnumIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
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
        return this.dataValue.toEnumIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toEnumNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toEnumDescriptionString();
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
        Tag700EnuReversalIndicator tagData;

        tagData = new Tag700EnuReversalIndicator( TESTA_ENU_REVERSAL_INDICATOR );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag700EnuReversalIndicator( TESTB_ENU_REVERSAL_INDICATOR );
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum700ReversalIndicator oneEnum : Enum700ReversalIndicator.values()) {
            System.out.println( new Tag700EnuReversalIndicator(oneEnum).toVerboseString() );
        }
    }
}
