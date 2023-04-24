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

package com.hwtsllc.fixengine.tags.fix42.tags;

import com.hwtsllc.fixengine.datatypes.FIX42;
import com.hwtsllc.fixengine.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine.tags.fix42.enums.Enum328InViewOfCommon;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  328
 *  InViewOfCommon
 *  Boolean
 *  <p>
 *  Indicates whether or not the halt was due to Common Stock trading being halted.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Halt was not related to a halt of the common stock
 *  <p>    Y - Half was due to common stock being halted
 */
public class Tag328EnuInViewOfCommon extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum328InViewOfCommon dataValue;

    public final static Enum328InViewOfCommon TESTA_ENU_IN_VIEW_OF_COMMON
            = Enum328InViewOfCommon.NO ;
    public final static Enum328InViewOfCommon TESTB_ENU_IN_VIEW_OF_COMMON
            = Enum328InViewOfCommon.YES;

    public Tag328EnuInViewOfCommon(Enum328InViewOfCommon dataValue) {
        setFixType(FIX42.FIX328_ENU_IN_VIEW_OF_COMMON);
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
        Tag328EnuInViewOfCommon tagData;

        tagData = new Tag328EnuInViewOfCommon(TESTA_ENU_IN_VIEW_OF_COMMON);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag328EnuInViewOfCommon(TESTB_ENU_IN_VIEW_OF_COMMON);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum328InViewOfCommon oneEnum : Enum328InViewOfCommon.values()) {
            System.out.println( new Tag328EnuInViewOfCommon(oneEnum).toVerboseString() );
        }
    }
}
