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
import com.hwtsllc.fixengine.tags.fix42.enums.Enum303QuoteRequestType;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  303
 *  QuoteRequestType
 *  int
 *  <p>
 *  Indicates the type of Quote Request being generated
 *  <p></p>
 *  Valid values:
 *  <p>    1-2 msg types
 *  <p>    "1 - Manual"
 *  <p>    "2 - Automatic"
 */
public class Tag303EnuQuoteRequestType extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum303QuoteRequestType dataValue;

    public final static Enum303QuoteRequestType TESTA_ENU_QUOTE_REQUEST_TYPE
            = Enum303QuoteRequestType.AUTOMATIC;
    public final static Enum303QuoteRequestType TESTB_ENU_QUOTE_REQUEST_TYPE
            = Enum303QuoteRequestType.MANUAL;

    public Tag303EnuQuoteRequestType(Enum303QuoteRequestType dataValue) {
        setFixType(FIX42.FIX303_ENU_QUOTE_REQUEST_TYPE);
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
        Tag303EnuQuoteRequestType tagData;

        tagData = new Tag303EnuQuoteRequestType(TESTA_ENU_QUOTE_REQUEST_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag303EnuQuoteRequestType(TESTB_ENU_QUOTE_REQUEST_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum303QuoteRequestType oneEnum : Enum303QuoteRequestType.values()) {
            System.out.println( new Tag303EnuQuoteRequestType(oneEnum).toVerboseString() );
        }
    }
}
