
XWAYLAND = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'xserver-xorg-extension-viv-autohdmi', '', d)}"

SOC_TOOLS_GPU_remove_mx7ulp = "${XWAYLAND}"

SOC_TOOLS_GPU_mx7ulp = " \
    imx-gpu-g2d \
    imx-gpu-sdk \
    imx-gpu-viv-tools \
    imx-gpu-apitrace \
    imx-gpu-viv-demos \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', \
                     'xserver-xorg-extension-viv-autohdmi', '', d)} \
"
