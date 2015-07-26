package org.verapdf.model.impl.pb.cos;

import org.apache.pdfbox.cos.COSName;
import org.verapdf.model.coslayer.CosRenderingIntent;

/**
 * @author Evgeniy Muravitskiy
 */
public class PBCosRenderingIntent extends PBCosName implements CosRenderingIntent {

	public static final String COS_RENDERING_INTENT_TYPE = "CosRenderingIntent";

	public PBCosRenderingIntent(COSName value) {
		super(value);
		setType(COS_RENDERING_INTENT_TYPE);
	}
}