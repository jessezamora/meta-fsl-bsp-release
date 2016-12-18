IMX_GPU_VIV_PACKAGECONFIG = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland opengl', 'wayland-gles2', \
                                bb.utils.contains('DISTRO_FEATURES', 'x11 opengl',     'x11-gl x11-gles2', \
                                                                                       '', d), d)}"
PACKAGECONFIG_mx7ulp   = "${IMX_GPU_VIV_PACKAGECONFIG}"
