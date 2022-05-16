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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.FIX41Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyEnumFXRateCalc;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  156 (same as 156, 1046,)
 *  SettlCurrFxRateCalc
 *  char
 *  <p>
 *  Specifies whether or not SettlCurrFxRate (55) should be multiplied or divided.
 *  <p></p>
 *  1046
 *  UnderlyingFXRateCalc
 *  char
 *  <p>
 *  Specifies whether the UnderlyingFxRate (1045) should be multiplied or divided.
 *  <p></p>
 *  Valid values:
 *  <p></p>
 *  <p>    M - Multiply
 *  <p>    D - Divide
 */
public class Tag156EnuSettlCurrFXRateCalc extends FIX41Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final MyEnumFXRateCalc dataValue;

    public final static MyEnumFXRateCalc TESTA_ENU_SETTL_CURR_FX_RATE_CALC
            = MyEnumFXRateCalc.MULTIPLY;
    public final static MyEnumFXRateCalc TESTB_ENU_SETTL_CURR_FX_RATE_CALC
            = MyEnumFXRateCalc.DIVIDE;

    public Tag156EnuSettlCurrFXRateCalc(MyEnumFXRateCalc dataValue) {
        setFixType(FIX41.FIX156_SETTL_CURR_FX_RATE_CALC);
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
        return getID()
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
                .concat("]");
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
        Tag156EnuSettlCurrFXRateCalc tagData;

        tagData = new Tag156EnuSettlCurrFXRateCalc(TESTA_ENU_SETTL_CURR_FX_RATE_CALC);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println("Accessing FIXType Directly");
        System.out.println("EnumName:" + tagData.getEnumName());
        System.out.println("ID:" + tagData.getID());
        System.out.println("Name:" + tagData.getName());
        System.out.println("Description:" + tagData.getDescription());
        System.out.println("DataIDString:" + tagData.toDataIDString());
        System.out.println("DataNameString:" + tagData.toDataNameString());
        System.out.println("DataDescriptionString:" + tagData.toDataDescriptionString());

        tagData = new Tag156EnuSettlCurrFXRateCalc(TESTB_ENU_SETTL_CURR_FX_RATE_CALC);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println("Accessing FIXType Directly");
        System.out.println("EnumName:" + tagData.getEnumName());
        System.out.println("ID:" + tagData.getID());
        System.out.println("Name:" + tagData.getName());
        System.out.println("Description:" + tagData.getDescription());
        System.out.println("DataIDString:" + tagData.toDataIDString());
        System.out.println("DataNameString:" + tagData.toDataNameString());
        System.out.println("DataDescriptionString:" + tagData.toDataDescriptionString());
    }
}
