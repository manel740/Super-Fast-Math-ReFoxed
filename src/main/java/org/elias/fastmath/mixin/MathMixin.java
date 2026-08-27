package org.elias.fastmath.mixin;

import net.minecraft.util.Mth;
import org.elias.fastmath.MathUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Mth.class)
public class MathMixin {

	@Overwrite
	public static float sin(double value) {
		return MathUtil.fastSin((float) value);
	}

	@Overwrite
	public static float cos(double value) {
		return MathUtil.fastCos((float) value);
	}

	@Overwrite
	public static float sqrt(float value) {
		return MathUtil.fastSqrt(value);
	}

	@Overwrite
	public static int floor(float value) {
		return MathUtil.fastFloor(value);
	}

	@Overwrite
	public static int floor(double value) {
		return MathUtil.fastFloor(value);
	}

	@Overwrite
	public static double length(double a, double b) {
		return Math.sqrt(a * a + b * b);
	}

	@Overwrite
	public static float lerp(float delta, float start, float end) {
		return MathUtil.fastLerp(delta, start, end);
	}

	@Overwrite
	public static double lerp(double delta, double start, double end) {
		return MathUtil.fastLerpDouble(delta, start, end);
	}

	@Overwrite
	public static int clamp(int value, int min, int max) {
		if (value < min) return min;
		return Math.min(value, max);
	}

	@Overwrite
	public static float wrapDegrees(float degrees) {
		float f = degrees % 360.0f;
		if (f >= 180.0f) f -= 360.0f;
		if (f < -180.0f) f += 360.0f;
		return f;
	}
}