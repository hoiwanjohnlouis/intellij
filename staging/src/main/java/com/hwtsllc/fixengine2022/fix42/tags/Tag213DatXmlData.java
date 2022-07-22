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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyDataType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  213
 *  XmlData
 *  data
 *  <p></p>
 *  Actual XML data stream (e.g. FIXML).
 *  <p></p>
 *  See appropriate XML reference (e.g. FIXML).
 *  <p></p>
 *  Note: may contain embedded SOH characters.
 */
public class Tag213DatXmlData extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyDataType dataValue;

    public final static String TESTA_DAT_XML_DATA
            = "BilboBaggins-Tag213DatXmlData";
    public final static String TESTB_DAT_XML_DATA
            = "Gandalf-Tag213DatXmlData";

    public Tag213DatXmlData(MyDataType dataValue) {
        setFixType(FIX42.FIX213_DAT_XML_DATA);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getDataValue();
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
                ;
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
        Tag213DatXmlData tagData;

        tagData= new Tag213DatXmlData(new MyDataType(TESTA_DAT_XML_DATA) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag213DatXmlData(new MyDataType(TESTB_DAT_XML_DATA) );
        System.out.println(tagData.toVerboseString());
    }
}
