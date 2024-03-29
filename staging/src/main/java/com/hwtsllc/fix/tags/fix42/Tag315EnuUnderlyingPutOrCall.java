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

package com.hwtsllc.fix.tags.fix42;

import com.hwtsllc.fix.datatypes.FIX42;
import com.hwtsllc.fix.datatypes.FIX42Abstract;
import com.hwtsllc.fix.datatypes.MyEnumPutOrCall;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  201 (same as 201, 315)
 *  PutOrCall
 *  int
 *  <p>
 *  Deprecated in FIX.4.2 Indicates whether an Option is for a put or call
 *  <p></p>
 *  315
 *  UnderlyingPutOrCall
 *  int
 *  <p>
 *  Deprecated in FIX.4.2 Underlying security's PutOrCall. See PutOrCall field for description
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Put
 *  <p>    1 - Call
 */
// @Deprecated
public class Tag315EnuUnderlyingPutOrCall extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final MyEnumPutOrCall dataValue;

    public final static MyEnumPutOrCall TESTA_ENU_UNDERLYING_PUT_OR_CALL
            = MyEnumPutOrCall.CALL;
    public final static MyEnumPutOrCall TESTB_ENU_UNDERLYING_PUT_OR_CALL
            = MyEnumPutOrCall.PUT;

    public Tag315EnuUnderlyingPutOrCall(MyEnumPutOrCall dataValue) {
        setFixType(FIX42.FIX315_ENU_UNDERLYING_PUT_OR_CALL);
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
        Tag315EnuUnderlyingPutOrCall tagData;

        tagData = new Tag315EnuUnderlyingPutOrCall(TESTA_ENU_UNDERLYING_PUT_OR_CALL);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag315EnuUnderlyingPutOrCall(TESTB_ENU_UNDERLYING_PUT_OR_CALL);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (MyEnumPutOrCall oneEnum : MyEnumPutOrCall.values()) {
            System.out.println( new Tag315EnuUnderlyingPutOrCall(oneEnum).toVerboseString() );
        }
    }
}
