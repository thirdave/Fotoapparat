package io.fotoapparat.hardware;

import io.fotoapparat.hardware.operators.AutoFocusOperator;
import io.fotoapparat.hardware.operators.CapabilitiesOperator;
import io.fotoapparat.hardware.operators.CaptureOperator;
import io.fotoapparat.hardware.operators.ConnectionOperator;
import io.fotoapparat.hardware.operators.OrientationOperator;
import io.fotoapparat.hardware.operators.ParametersOperator;
import io.fotoapparat.hardware.operators.PreviewOperator;
import io.fotoapparat.hardware.operators.PreviewStreamOperator;
import io.fotoapparat.hardware.operators.RendererParametersOperator;
import io.fotoapparat.hardware.operators.SurfaceOperator;
import io.fotoapparat.parameter.LensPosition;
import io.fotoapparat.parameter.Parameters;
import io.fotoapparat.parameter.RendererParameters;
import io.fotoapparat.photo.Photo;
import io.fotoapparat.preview.PreviewStream;

/**
 * Abstraction for camera hardware.
 */
public interface CameraDevice extends CaptureOperator,
        PreviewOperator, CapabilitiesOperator, OrientationOperator, ParametersOperator,
        ConnectionOperator, SurfaceOperator, PreviewStreamOperator, RendererParametersOperator,
        AutoFocusOperator {

    @Override
    void open(LensPosition lensPosition);

    @Override
    void close();

    @Override
    void startPreview();

    @Override
    void stopPreview();

    @Override
    void setDisplaySurface(Object displaySurface);

    @Override
    void setDisplayOrientation(int degrees);

    @Override
    void updateParameters(Parameters parameters);

    @Override
    Capabilities getCapabilities();

    @Override
    Photo takePicture();

    @Override
    PreviewStream getPreviewStream();

    @Override
    RendererParameters getRendererParameters();

    @Override
    void autoFocus();

}