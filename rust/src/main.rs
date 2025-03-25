fn main() {
    println!("{:?}", two_sum(vec![3,2,4], 6));
}

pub fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {
    nums
        .iter()
        .enumerate()
        .map(|(index_outer, value_outer)|
            nums
                .iter()
                .enumerate()
                .fold(
                    None,
                    |acc, (index_inner, value_inner)| {
                        return if value_inner + value_outer == target && index_inner != index_outer {
                            Some(vec![index_inner as i32, index_outer as i32])
                        } else if acc.is_some() {
                            acc
                        } else {
                            None
                        }
                    }
                )
        )
        .filter(|option| option.is_some())
        .take(1)
        .flat_map(|option| option.unwrap())
        .collect::<Vec<_>>()
}