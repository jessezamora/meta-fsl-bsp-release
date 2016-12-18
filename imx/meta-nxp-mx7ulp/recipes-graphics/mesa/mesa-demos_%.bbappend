SRC_URI_append_mx7ulp = " file://Replace-glWindowPos2iARB-calls-with-glWindowPos2i.patch \
                    file://fix-clear-build-break.patch \
                    file://Additional-eglSwapBuffer-calling-makes-wrong-throttl.patch \
                    file://Add-OpenVG-demos-to-support-wayland.patch \
                    file://0001-mesa-demos-OpenVG-demos-with-single-frame-need-eglSw.patch \
"

PACKAGECONFIG_remove_mx7ulp = "${REMOVE_GLU}"

PACKAGECONFIG_append_mx7ulp = " ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland vg', '', d)}"
PACKAGECONFIG_append_mx7ulp = " ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'glut', '', d)}"
