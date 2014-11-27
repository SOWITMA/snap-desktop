/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.esa.snap.gui.nodes;

import org.esa.beam.framework.datamodel.IndexCoding;

import java.beans.IntrospectionException;

/**
 * A node that represents an {@link org.esa.beam.framework.datamodel.IndexCoding} (=IC).
 *
 * @author Norman
 */
public class ICNode extends PNLeafNode<IndexCoding> {

    public ICNode(IndexCoding indexCoding) throws IntrospectionException {
        super(indexCoding);
        // todo
        //setIconBaseWithExtension("org/esa/snap/gui/icons/xxx.gif");
    }
}