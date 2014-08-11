/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.coretelephony;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.corefoundation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreTelephony")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CTRadioAccessTechnology/*</name>*/ 
    extends /*<extends>*/Object/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(CTRadioAccessTechnology.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    public static CTRadioAccessTechnology GPRS = new CTRadioAccessTechnology(GPRSValue());
    public static CTRadioAccessTechnology Edge = new CTRadioAccessTechnology(EdgeValue());
    public static CTRadioAccessTechnology WCDMA = new CTRadioAccessTechnology(WCDMAValue());
    public static CTRadioAccessTechnology HSDPA = new CTRadioAccessTechnology(HSDPAValue());
    public static CTRadioAccessTechnology HSUPA = new CTRadioAccessTechnology(HSUPAValue());
    public static CTRadioAccessTechnology CDMA1x = new CTRadioAccessTechnology(CDMA1xValue());
    public static CTRadioAccessTechnology CDMAEVDORev0 = new CTRadioAccessTechnology(CDMAEVDORev0Value());
    public static CTRadioAccessTechnology CDMAEVDORevA = new CTRadioAccessTechnology(CDMAEVDORevAValue());
    public static CTRadioAccessTechnology CDMAEVDORevB = new CTRadioAccessTechnology(CDMAEVDORevBValue());
    public static CTRadioAccessTechnology eHRPD = new CTRadioAccessTechnology(eHRPDValue());
    public static CTRadioAccessTechnology LTE = new CTRadioAccessTechnology(LTEValue());
    private static CTRadioAccessTechnology[] values = new CTRadioAccessTechnology[] {GPRS, Edge, WCDMA, HSDPA, HSUPA, CDMA1x, CDMAEVDORev0, CDMAEVDORevA, CDMAEVDORevB, eHRPD, LTE};
    
    private NSString value;
    
    private CTRadioAccessTechnology(NSString value) {
        this.value = value;
    }
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    public NSString value() {
        return value;
    }
    
    public static CTRadioAccessTechnology valueOf(NSString value) {
        for (CTRadioAccessTechnology v : values) {
            if (v.value.equals(value)) {
                return v;
            }
        }
        return null;
    }
    /*<
    /*<methods>*/
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="CTRadioAccessTechnologyGPRS", optional=true)
    protected static native NSString GPRSValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="CTRadioAccessTechnologyEdge", optional=true)
    protected static native NSString EdgeValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="CTRadioAccessTechnologyWCDMA", optional=true)
    protected static native NSString WCDMAValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="CTRadioAccessTechnologyHSDPA", optional=true)
    protected static native NSString HSDPAValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="CTRadioAccessTechnologyHSUPA", optional=true)
    protected static native NSString HSUPAValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="CTRadioAccessTechnologyCDMA1x", optional=true)
    protected static native NSString CDMA1xValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="CTRadioAccessTechnologyCDMAEVDORev0", optional=true)
    protected static native NSString CDMAEVDORev0Value();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="CTRadioAccessTechnologyCDMAEVDORevA", optional=true)
    protected static native NSString CDMAEVDORevAValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="CTRadioAccessTechnologyCDMAEVDORevB", optional=true)
    protected static native NSString CDMAEVDORevBValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="CTRadioAccessTechnologyeHRPD", optional=true)
    protected static native NSString eHRPDValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="CTRadioAccessTechnologyLTE", optional=true)
    protected static native NSString LTEValue();
    /*</methods>*/
}