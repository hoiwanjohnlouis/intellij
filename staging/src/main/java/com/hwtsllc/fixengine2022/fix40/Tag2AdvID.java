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

package com.hwtsllc.fixengine2022.fix40;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Tag2AdvID implements FixTagValuePairString, LogStringVerbose {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();
    // private static final Logger logger = LogManager.getLogger(Tag1Account.class);

    private final FIXType fixType = FIXType.ADV_ID;
    private final String dataValue;

    public Tag2AdvID(final String dataValue) {
        this.dataValue = dataValue;
    }

    public String getFIXTypeName() {
        return fixType.getFIXTypeName();
    }
    public String getFIXName() {
        return fixType.getFIXName();
    }
    public int getFIXNumber() {
        return fixType.getFIXNumber();
    }
    public String getFIXDescription() {
        return fixType.getFIXDescription();
    }
    public String getDataValue() {
        return this.dataValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName())
                .append("=[")
                .append(getFIXTypeName())
                .append(",")
                .append(getFIXName())
                .append(",")
                .append(getFIXNumber())
                .append(",")
                .append(getDataValue())
                .append("]");
        return sb.toString();
    }
    @Override
    public String toLogStringVerbose() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName())
                .append("\n\tFIXTypeName[")
                .append(getFIXTypeName())
                .append("]")
                .append("\n\tFIXNumber[")
                .append(getFIXNumber())
                .append("]")
                .append("\n\tFIXName[")
                .append(getFIXName())
                .append("]")
                .append("\n\tFIXDescription[")
                .append(getFIXDescription())
                .append("]")
                .append("\n\tDataValue[")
                .append(getDataValue())
                .append("]");
        return sb.toString();
    }
    @Override
    public String toFixTagValuePairString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFIXNumber())
                .append("=")
                .append(getDataValue());
        return sb.toString();
    }

    /*
     *
     */
    public static void main(String[] args) {

        Tag2AdvID tag2AdvID = new Tag2AdvID("adv id");
        System.out.println("t1.1:"+tag2AdvID);
        System.out.println("t1.2.verbose:"+tag2AdvID.toLogStringVerbose());
        System.out.println("t1.3.FIXTypeName:"+tag2AdvID.getFIXTypeName());
        System.out.println("t1.4.FIXNumber:"+tag2AdvID.getFIXNumber());
        System.out.println("t1.5.FIXName:"+tag2AdvID.getFIXName());
        System.out.println("t1.6.FIXDescription:"+tag2AdvID.getFIXDescription());
        System.out.println("t1.7.DataValue:"+tag2AdvID.getDataValue());
        System.out.println("t1.8.FixString:"+tag2AdvID.toFixTagValuePairString());

    }
}
