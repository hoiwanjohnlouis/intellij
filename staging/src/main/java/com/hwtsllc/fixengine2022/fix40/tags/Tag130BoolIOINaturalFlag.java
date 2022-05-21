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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX40;
import com.hwtsllc.fixengine2022.datatypes.FIX40Abstract;
import com.hwtsllc.fixengine2022.fix40.enums.Bool130IOINaturalFlag;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  130
 *  IOINaturalFlag
 *  Boolean
 *  <p>
 *  Indicates that IOI is the result of an existing agency order
 *  or a facilitation position resulting from an agency order,
 *  not from principal trading or order solicitation activity.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Not Natural
 *  <p>    Y - Natural
 */
public class Tag130BoolIOINaturalFlag extends FIX40Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Bool130IOINaturalFlag dataValue;

    public final static Bool130IOINaturalFlag TESTA_BOOL_IOI_NATURAL_FLAG = Bool130IOINaturalFlag.NO ; // fake data
    public final static Bool130IOINaturalFlag TESTB_BOOL_IOI_NATURAL_FLAG = Bool130IOINaturalFlag.YES;

    public Tag130BoolIOINaturalFlag(Bool130IOINaturalFlag dataValue) {
        setFixType(FIX40.FIX130_BOOL_IOI_NATURAL_FLAG);
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
        System.out.println( new Tag130BoolIOINaturalFlag(TESTA_BOOL_IOI_NATURAL_FLAG).toVerboseString() );
        System.out.println( new Tag130BoolIOINaturalFlag(TESTB_BOOL_IOI_NATURAL_FLAG).toVerboseString() );

        // loop around the ENUM and display
        for (Bool130IOINaturalFlag oneEnum : Bool130IOINaturalFlag.values()) {
            System.out.println( new Tag130BoolIOINaturalFlag(oneEnum).toVerboseString() );
        }
    }
}
