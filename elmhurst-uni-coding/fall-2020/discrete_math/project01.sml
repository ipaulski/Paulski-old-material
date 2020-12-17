(*Izabella Paulski CS302 Project 1*)

1.

  fun foldr(f, s, []) = s
      | foldr(f, s, x::rest) = f(x, foldr(f, s, rest));
val foldr = fn : ('a * 'b -> 'b) * 'b * 'a list -> 'b

fun indefIntegratePoly(coeffs) =
      #1(foldr(fn(c, (intCoeffs, degree)) =>
          ((c/real(degree+1))::intCoeffs, degree + 1),
               ([0.0],0), coeffs));
val indefIntegratePoly = fn : real list -> real list


2.

 fun secantMethod(f, cur, prev, tol) =
   let
     val next = cur - (f(cur)*((cur-prev)/f(cur)-f(prev)))
   in
     if((abs(next - cur)) < tol) then next
       else secantMethod(f, next, cur, tol)
   end;
val secantMethod = fn : (real -> real) * real * real * real -> real

3.

 fun trapezoidMethod(a, b ,n, f) =
    if (n <= 0) orelse (b-a < 0.0) then 0.0
    else
      let
        val delta = (b-a)/real(n)
          fun trap1(x,0) = 0.0
            | trap1(x, i) = ((delta*((f(a+((real(i))-1.0)*delta)) +
                (f(a+(real(i))*delta))))/2.0) + trap1(x+delta, i-1)
      in
        trap1(a,n)
      end;
val trapezoidMethod = fn : real * real * int * (real -> real) -> real
