/*
 * Copyright (c) 1997, 2011, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/* this file is generated by RelaxNGCC */
package com.sun.xml.internal.xsom.impl.parser.state;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.Attributes;
import com.sun.xml.internal.xsom.impl.parser.NGCCRuntimeEx;

    import com.sun.xml.internal.xsom.*;
    import com.sun.xml.internal.xsom.parser.*;
    import com.sun.xml.internal.xsom.impl.*;
    import com.sun.xml.internal.xsom.impl.parser.*;
    import org.xml.sax.Locator;
    import org.xml.sax.ContentHandler;
    import org.xml.sax.helpers.*;
    import java.util.*;
    import java.math.BigInteger;

import java.util.StringTokenizer;
      import java.util.HashSet;


class wildcardBody extends NGCCHandler {
    private AnnotationImpl annotation;
    private Locator locator;
    private String modeValue;
    private String ns;
    private ForeignAttributesImpl fa;
    protected final NGCCRuntimeEx $runtime;
    private int $_ngcc_current_state;
    protected String $uri;
    protected String $localName;
    protected String $qname;

    public final NGCCRuntime getRuntime() {
        return($runtime);
    }

    public wildcardBody(NGCCHandler parent, NGCCEventSource source, NGCCRuntimeEx runtime, int cookie, Locator _locator) {
        super(source, parent, cookie);
        $runtime = runtime;
        this.locator = _locator;
        $_ngcc_current_state = 10;
    }

    public wildcardBody(NGCCRuntimeEx runtime, Locator _locator) {
        this(null, runtime, runtime, -1, _locator);
    }

    public void enterElement(String $__uri, String $__local, String $__qname, Attributes $attrs) throws SAXException {
        int $ai;
        $uri = $__uri;
        $localName = $__local;
        $qname = $__qname;
        switch($_ngcc_current_state) {
        case 5:
            {
                if(($ai = $runtime.getAttributeIndex("","processContents"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    $_ngcc_current_state = 1;
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
            }
            break;
        case 9:
            {
                if((($ai = $runtime.getAttributeIndex("","processContents"))>=0 || ($ai = $runtime.getAttributeIndex("","namespace"))>=0)) {
                    NGCCHandler h = new foreignAttributes(this, super._source, $runtime, 412, null);
                    spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    NGCCHandler h = new foreignAttributes(this, super._source, $runtime, 412, null);
                    spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                }
            }
            break;
        case 10:
            {
                if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("annotation"))) {
                    NGCCHandler h = new annotation(this, super._source, $runtime, 414, null,AnnotationContext.WILDCARD);
                    spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    $_ngcc_current_state = 9;
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
            }
            break;
        case 1:
            {
                if(($ai = $runtime.getAttributeIndex("","namespace"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    $_ngcc_current_state = 0;
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
            }
            break;
        case 0:
            {
                revertToParentFromEnterElement(makeResult(), super._cookie, $__uri, $__local, $__qname, $attrs);
            }
            break;
        default:
            {
                unexpectedEnterElement($__qname);
            }
            break;
        }
    }

    public void leaveElement(String $__uri, String $__local, String $__qname) throws SAXException {
        int $ai;
        $uri = $__uri;
        $localName = $__local;
        $qname = $__qname;
        switch($_ngcc_current_state) {
        case 5:
            {
                if(($ai = $runtime.getAttributeIndex("","processContents"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
                }
                else {
                    $_ngcc_current_state = 1;
                    $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
                }
            }
            break;
        case 9:
            {
                if((($ai = $runtime.getAttributeIndex("","processContents"))>=0 || ($ai = $runtime.getAttributeIndex("","namespace"))>=0)) {
                    NGCCHandler h = new foreignAttributes(this, super._source, $runtime, 412, null);
                    spawnChildFromLeaveElement(h, $__uri, $__local, $__qname);
                }
                else {
                    NGCCHandler h = new foreignAttributes(this, super._source, $runtime, 412, null);
                    spawnChildFromLeaveElement(h, $__uri, $__local, $__qname);
                }
            }
            break;
        case 10:
            {
                $_ngcc_current_state = 9;
                $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 1:
            {
                if(($ai = $runtime.getAttributeIndex("","namespace"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
                }
                else {
                    $_ngcc_current_state = 0;
                    $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
                }
            }
            break;
        case 0:
            {
                revertToParentFromLeaveElement(makeResult(), super._cookie, $__uri, $__local, $__qname);
            }
            break;
        default:
            {
                unexpectedLeaveElement($__qname);
            }
            break;
        }
    }

    public void enterAttribute(String $__uri, String $__local, String $__qname) throws SAXException {
        int $ai;
        $uri = $__uri;
        $localName = $__local;
        $qname = $__qname;
        switch($_ngcc_current_state) {
        case 5:
            {
                if(($__uri.equals("") && $__local.equals("processContents"))) {
                    $_ngcc_current_state = 7;
                }
                else {
                    $_ngcc_current_state = 1;
                    $runtime.sendEnterAttribute(super._cookie, $__uri, $__local, $__qname);
                }
            }
            break;
        case 9:
            {
                if((($__uri.equals("") && $__local.equals("processContents")) || ($__uri.equals("") && $__local.equals("namespace")))) {
                    NGCCHandler h = new foreignAttributes(this, super._source, $runtime, 412, null);
                    spawnChildFromEnterAttribute(h, $__uri, $__local, $__qname);
                }
                else {
                    NGCCHandler h = new foreignAttributes(this, super._source, $runtime, 412, null);
                    spawnChildFromEnterAttribute(h, $__uri, $__local, $__qname);
                }
            }
            break;
        case 10:
            {
                $_ngcc_current_state = 9;
                $runtime.sendEnterAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 1:
            {
                if(($__uri.equals("") && $__local.equals("namespace"))) {
                    $_ngcc_current_state = 3;
                }
                else {
                    $_ngcc_current_state = 0;
                    $runtime.sendEnterAttribute(super._cookie, $__uri, $__local, $__qname);
                }
            }
            break;
        case 0:
            {
                revertToParentFromEnterAttribute(makeResult(), super._cookie, $__uri, $__local, $__qname);
            }
            break;
        default:
            {
                unexpectedEnterAttribute($__qname);
            }
            break;
        }
    }

    public void leaveAttribute(String $__uri, String $__local, String $__qname) throws SAXException {
        int $ai;
        $uri = $__uri;
        $localName = $__local;
        $qname = $__qname;
        switch($_ngcc_current_state) {
        case 5:
            {
                $_ngcc_current_state = 1;
                $runtime.sendLeaveAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 9:
            {
                NGCCHandler h = new foreignAttributes(this, super._source, $runtime, 412, null);
                spawnChildFromLeaveAttribute(h, $__uri, $__local, $__qname);
            }
            break;
        case 2:
            {
                if(($__uri.equals("") && $__local.equals("namespace"))) {
                    $_ngcc_current_state = 0;
                }
                else {
                    unexpectedLeaveAttribute($__qname);
                }
            }
            break;
        case 10:
            {
                $_ngcc_current_state = 9;
                $runtime.sendLeaveAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 1:
            {
                $_ngcc_current_state = 0;
                $runtime.sendLeaveAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 6:
            {
                if(($__uri.equals("") && $__local.equals("processContents"))) {
                    $_ngcc_current_state = 1;
                }
                else {
                    unexpectedLeaveAttribute($__qname);
                }
            }
            break;
        case 0:
            {
                revertToParentFromLeaveAttribute(makeResult(), super._cookie, $__uri, $__local, $__qname);
            }
            break;
        default:
            {
                unexpectedLeaveAttribute($__qname);
            }
            break;
        }
    }

    public void text(String $value) throws SAXException {
        int $ai;
        switch($_ngcc_current_state) {
        case 5:
            {
                if(($ai = $runtime.getAttributeIndex("","processContents"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendText(super._cookie, $value);
                }
                else {
                    $_ngcc_current_state = 1;
                    $runtime.sendText(super._cookie, $value);
                }
            }
            break;
        case 7:
            {
                modeValue = $value;
                $_ngcc_current_state = 6;
            }
            break;
        case 9:
            {
                if(($ai = $runtime.getAttributeIndex("","namespace"))>=0) {
                    NGCCHandler h = new foreignAttributes(this, super._source, $runtime, 412, null);
                    spawnChildFromText(h, $value);
                }
                else {
                    if(($ai = $runtime.getAttributeIndex("","processContents"))>=0) {
                        NGCCHandler h = new foreignAttributes(this, super._source, $runtime, 412, null);
                        spawnChildFromText(h, $value);
                    }
                    else {
                        NGCCHandler h = new foreignAttributes(this, super._source, $runtime, 412, null);
                        spawnChildFromText(h, $value);
                    }
                }
            }
            break;
        case 3:
            {
                ns = $value;
                $_ngcc_current_state = 2;
            }
            break;
        case 10:
            {
                $_ngcc_current_state = 9;
                $runtime.sendText(super._cookie, $value);
            }
            break;
        case 1:
            {
                if(($ai = $runtime.getAttributeIndex("","namespace"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendText(super._cookie, $value);
                }
                else {
                    $_ngcc_current_state = 0;
                    $runtime.sendText(super._cookie, $value);
                }
            }
            break;
        case 0:
            {
                revertToParentFromText(makeResult(), super._cookie, $value);
            }
            break;
        }
    }

    public void onChildCompleted(Object $__result__, int $__cookie__, boolean $__needAttCheck__)throws SAXException {
        switch($__cookie__) {
        case 412:
            {
                fa = ((ForeignAttributesImpl)$__result__);
                $_ngcc_current_state = 5;
            }
            break;
        case 414:
            {
                annotation = ((AnnotationImpl)$__result__);
                $_ngcc_current_state = 9;
            }
            break;
        }
    }

    public boolean accepted() {
        return((($_ngcc_current_state == 0) || (($_ngcc_current_state == 1) || ($_ngcc_current_state == 5))));
    }


      private WildcardImpl makeResult() {
        if(modeValue==null) modeValue="strict";

        int mode=-1;
        if(modeValue.equals("strict"))      mode = XSWildcard.STRTICT;
        if(modeValue.equals("lax"))         mode = XSWildcard.LAX;
        if(modeValue.equals("skip"))        mode = XSWildcard.SKIP;
        if(mode==-1)        throw new InternalError();

        if(ns==null || ns.equals("##any"))
            return new WildcardImpl.Any( $runtime.document, annotation,locator,fa,mode);

        if(ns.equals("##other"))
            return new WildcardImpl.Other( $runtime.document,
                annotation,locator,fa,
                $runtime.currentSchema.getTargetNamespace(),mode);

        StringTokenizer tokens = new StringTokenizer(ns);
        HashSet s = new HashSet();
        while(tokens.hasMoreTokens()) {
            String ns = tokens.nextToken();
            if(ns.equals("##local")) ns="";
            if(ns.equals("##targetNamespace")) ns=$runtime.currentSchema.getTargetNamespace();
            s.add(ns);
        }

        return new WildcardImpl.Finite( $runtime.document, annotation,locator,fa,s,mode);
      }

}