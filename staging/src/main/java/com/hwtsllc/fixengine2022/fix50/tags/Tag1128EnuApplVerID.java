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

import com.hwtsllc.fixengine2022.datatypes.*;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  1128 (same as 1128, 1030, 1137,)
 *  ApplVerID
 *  String
 *  <p>
 *  Specifies the service pack release being applied at message level.
 *  <p></p>
 *  Enumerated field with values assigned at time of service pack release
 *  <p></p>
 *  1130
 *  RefApplVerID
 *  String
 *  <p>
 *  Specifies the service pack release being applied to a message at the session level.
 *  <p></p>
 *  Enumerated field with values assigned at time of service pack release.
 *  <p></p>
 *  Uses same values as ApplVerID (1128)
 *  <p></p>
 *  1137
 *  DefaultApplVerID
 *  String
 *  <p>
 *  Specifies the service pack release being applied, by default, to message at the session level.
 *  <p></p>
 *  Enumerated field with values assigned at time of service pack release.
 *  <p></p>
 *  Uses same values as ApplVerID (1128)
 *  <p></p>
 *  Valid values:
 *  <p>    0 - FIX27
 *  <p>    1 - FIX30
 *  <p>    2 - FIX40
 *  <p>    3 - FIX41
 *  <p>    4 - FIX42
 *  <p></p>
 *  <p>    5 - FIX43
 *  <p>    6 - FIX44
 *  <p>    7 - FIX50
 */
public class Tag1128EnuApplVerID extends FIX50Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final MyEnumApplVerID dataValue;

    public final static MyEnumApplVerID TESTA_ENU_APPL_VER_ID
            = MyEnumApplVerID.FIX42;
    public final static MyEnumApplVerID TESTB_ENU_APPL_VER_ID
            = MyEnumApplVerID.FIX44;

    public Tag1128EnuApplVerID(MyEnumApplVerID dataValue) {
        setFixType(FIX50.FIX1128_ENU_APPL_VER_ID);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
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
        return dataValue.toEnumIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toEnumNameString();
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
        Tag1128EnuApplVerID tagData;

        tagData = new Tag1128EnuApplVerID(TESTA_ENU_APPL_VER_ID);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1128EnuApplVerID(TESTB_ENU_APPL_VER_ID);
        System.out.println(tagData.toVerboseString());
    }
}
