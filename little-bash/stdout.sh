function get_date_set() {
  start_date=$1
  days=$2
  dates=${start_date}

  for ((i=1 ; i<$days ; i=i+1)); then
  do
    n_days_ago=$(date -d "${i} days ${start_date}" +%F)
    dates="$dates,n_days_ago"
  done
  for ((i=-1 ; i>$days ; i=i-1)); then
  do
    n_days_ago=$(date -d "${i} days ${start_date}" +%F)
    dates="$dates,n_days_ago"
  done

  echo "{$dates}"
}

function check_current_availability() {
  available=1

  ${hadoop} fs -test -e $1/_SUCCESS
  if [[ $? -eq 0 ]]; then
    available=0
  fi

  echo ${available}
}

function get_ready_date() {
  i=0
  previous_date=$(date -d "$i days ago" +%F)
  date=""

  while true
  do
    ${hadoop} fs -test -e $1/${previous_date}/_SUCCESS
    if [[ $? -eq 0 ]]; then
      date=${previous_date}
      break
    else
      (( i+=1 ))
      previous_date=$(date -d "$i days ago" +%F)
    fi
  done

  echo "$1/${date}"


}


























